package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration //ES UNA CLASE DE CONFIGURACION, se carga con el programa y se ejecuta su commandLineRunner, que incluye dos Students.
public class StudentConfig {

    @Bean //para que sea reconocido por spring
    CommandLineRunner commandLineRunner(StudentRepository repository){ //permite conectar con el repositorio
        return args -> {
            Student Matias = new Student("Matias", "matias@email.com", LocalDate.of(2000,01,01));
            //EL AGE LO MOSTRARÁ CON getAge, ya que el campo age esta señalado con @TRANSIENT
            Student Marcos = new Student("Marcos", "marcos@email.com", LocalDate.of(1998,9,9));

            repository.saveAll(List.of(Matias, Marcos)); //DEVUELVE ESTE COMANDO AL FINAL, CON EL COMMANDLINERUNER
        };
    }
}
