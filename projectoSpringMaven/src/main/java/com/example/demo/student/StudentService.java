package com.example.demo.student;

import ch.qos.logback.core.CoreConstants;
import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
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
}
