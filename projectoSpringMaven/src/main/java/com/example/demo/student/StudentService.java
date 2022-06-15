package com.example.demo.student;

import com.example.demo.student.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service //anotacion necesaria en los servicios para ser reconocidos como tal
//@Component lo mismo que service pero service es semanticamente más correcto
public class StudentService {


    public List<Student> getStudents(){
        return List.of( new Student(1L, "mariam","hasjdk@ashjdk.com", LocalDate.of(2000,1,1),22) ) ;
    }
}
