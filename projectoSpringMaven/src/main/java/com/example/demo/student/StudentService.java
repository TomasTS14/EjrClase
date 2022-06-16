package com.example.demo.student;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
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
}
