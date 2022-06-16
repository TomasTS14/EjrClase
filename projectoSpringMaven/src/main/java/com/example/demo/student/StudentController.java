package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")  //En caso de que haya una request para ese Path, sacar lo que haya en GetMapping.
public class StudentController {

private final StudentService studentService;
    @Autowired //sirve para que aquello necesario en el constructor, se inicialice solo.
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping //Puedo probar a enviar request POST con POSTMAN, en formato JSON, recordar formato "param" : "value" con comillas incluiudas
    public void addStudent(@RequestBody Student student ){ //MAPEA EL requestbody a un student, o lo intenta.
    studentService.addStudent(student);
    }
}
