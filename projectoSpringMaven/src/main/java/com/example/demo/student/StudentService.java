package com.example.demo.student;

import ch.qos.logback.core.CoreConstants;
import com.example.demo.student.Student;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service //anotacion necesaria en los servicios para ser reconocidos como tal
//@Component lo mismo que service pero service es semanticamente más correcto
public class StudentService {

    private  final StudentRepository studentRepository; //usará dependency injection!!!!!

    @Autowired //para que se inicialice solo el el objeto studentRepository
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository; //como dije, se inicializará solo.
     }
    public List<Student> getStudents() {
        return studentRepository.findAll(); //ESTO son metodos que no he implementado yo, pero que forman parte
        //de spring-jpa-data.
    }

    //PRUEBA PRUEBA PRUEBA FUERA DE TUTORIAL PRUEBA PRUEBA


    public Student getOneStudent(Long id){
        Student studentById = studentRepository.findStudentById(id).
                orElseThrow(() -> new IllegalStateException("Theres no student with that id"));

        return  studentById;
    }
    public void addStudent(Student student){
        Optional<Student> optionalStudent = studentRepository.findStudentByEmail(student.getEmail());
        //Es un contenedor que puede contener un valor nulo o no nulo. El student repository @Repository hará la consulta. que devolvera nulo o no nulo,o vacio

        if (optionalStudent.isPresent()){ //Comprobará si es no nulo (osea que la encuesta devolvio algo o no)
            throw new  IllegalStateException("Email taken duuuh"); //soltará excepcion si hay dentro un valor no nulo.
        }
        //ESTO OCURRIRÁ SI NO SE LLEGA A LANZAR LA EXCEPCION.
        studentRepository.save(student); //De los metodos del StudentRepository que extiende JPA. puede guardar el student.
        //Este metodo lo uso en StudentController cuando llega un POST request

    }

    public void deleteStudent(Long id) {

        //metodo propio del studentRepository al ser un repository que extiende JPArepository
        //Comprueba si existe, devuelve un true si sí o un no si no
        boolean exist = studentRepository.existsById(id);

        if(!exist){
            throw new IllegalStateException("Student with id "+id+" does not exist");
        }

        //En caso de que exista, lo borra por el mismo id con el que comprobó antes.
        studentRepository.deleteById(id);
    }

    /**TODO*/ //Estudiar que hace el transactioanl, supuestamente permite hacer el query sin especificar el query en el repositorio
    @Transactional
    public void updateStudent(Long id, String name, String email) {
        //entran estos tres parametros, , compruebo que el estudiante existe por id, y si no, suelto excepcion.
        //Si existe lo guardo

        Student student = studentRepository.findById(id).
                orElseThrow(()-> new IllegalStateException("Student with id "+id+" does not exist"));

        //Si si me pasan nombre y este no es el mismo que el que ya tiene el estudiante, se lo cambio
        if (name != null &&
                name.length() > 0 &&
                !Objects.equals(student.getName(), name)){
                student.setName(name);
        }

        //Si si me pasan un nombre y este no es el mismo que el que ya tiene el estudiante, lo cambio
        //Pero uso un optional para verificar si ya está presente un estudiante con ese email, en caso de que si suelto excepcion.
        //En caso de que no, lo guardo.
        if (email != null &&
            email.length() > 0 &&
            !Objects.equals(student.getEmail(), email)){
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
            if (studentOptional.isPresent()) throw new IllegalStateException("email taken");
            student.setEmail(email);
        }
    }
}
