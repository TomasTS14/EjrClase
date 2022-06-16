package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //PARA ESPECIFICAR QUE ESTE ELEMENTO DE SPRING BOOT ES UN REPOSITORIO. RESPONSABLE PARA DATA ACCES
public interface StudentRepository extends JpaRepository<Student, Long> { //para acceder a base de datos
    /*Se especifica el tipo de objeto que trabaja el repositorio especifico, y 2º el tipo de Id que usa ese obj (Long).*/




}
