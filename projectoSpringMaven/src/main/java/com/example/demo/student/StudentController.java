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

    //FIXME /**Funciona siiiii*/
    //PRUEBA FUERA DE TUTORIAL, MULTIPLES METODOS PARA UNA SOLA COSA
    @GetMapping(path = "{studentId}") //Esto será lo que venga despues de la ruta de requestMapping
    public  Student getOneStudent(
            @PathVariable("studentId")Long id){ //LO QUE LLEGA ES UN STUDENT ID, DEVUELVO UN STUDENT
        System.out.println(id); //SACA POR CONSOLA LO QUE VOY PONIENDO EN LA BARRA DE NAVEGADOR
        return studentService.getOneStudent(id);
    }



    @PostMapping //Puedo probar a enviar request POST con POSTMAN, en formato JSON, recordar formato "param" : "value" con comillas incluiudas
    public void addStudent(@RequestBody Student student ){ //MAPEA EL requestbody a un student, o lo intenta.
    studentService.addStudent(student);
    }

    //Entiendo que esto es tdo lo que venga después del request mapping, por ejemplo api/v1/student/1 sería para borrar el de id 1
    @DeleteMapping(path ="{studentId}")
    //Esto le especifico que lo que viene después es especificamente el studentId, el cual es un Long
    public void deleteStudent(@PathVariable("studentId")Long id){

        studentService.deleteStudent(id);

    }

    //Esta parte similar al delete, lo que vengas despues de mi requestMapping
    @PutMapping(path="{studentId}")

    public void updateStudent(
            @PathVariable("studentId")Long id, //me pasan un param como pagina/api/v1/student/1? "1 sería la id"
            @RequestParam(required= false) String name, //Me pasan un param opcional, pagina/api/v1/student/1?name=Tomas
            //El nuevo nombre para id 1 sería Tomas.
            @RequestParam(required = false) String email ){ //Lo mismo que con el anterior de name.

        studentService.updateStudent(id, name, email);

    }
}
