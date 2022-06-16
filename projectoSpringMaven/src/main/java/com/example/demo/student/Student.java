package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity //permite que sea mapeado por jpa a la DB en postgres que estoy usando (sale en application.properties)
@Table //Es una tabla cada campo
public class Student {
//Esto aqui abajo no lo he entendido bien
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1 //imagino que esto tiene que ver con la creacion de IDs, aunque no se
            //como compatibiliza con que tengo un autoincrement en la tabla de students en school
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, //Imagino que esto mantendrá la cuenta de las IDs
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    @Transient //NO FORMA PARTE DE LA BASE DE DATOS, SE CALCULA EN EL PROGRAMA
    private int age;

    public Student() {
    }

    public Student(Long id, String name, String email, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;

    }

    public Student(String name, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears(); //ESTE GETTER DEVUELVE EL CALCULO,
        // Y CONECTA CON AL REPRESENTACION DE LA EDAD
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.example.demo.student.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }
}
