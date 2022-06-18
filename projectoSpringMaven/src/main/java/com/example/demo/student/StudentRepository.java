package com.example.demo.student;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //PARA ESPECIFICAR QUE ESTE ELEMENTO DE SPRING BOOT ES UN REPOSITORIO. RESPONSABLE PARA DATA ACCES
public interface StudentRepository extends JpaRepository<Student, Long> { //para acceder a base de datos
   /*Se especifica el tipo de objeto que trabaja el repositorio especifico, y 2º el tipo de Id que usa ese obj (Long).*/


   @Query("select s from Student s where s.email = ?1")
      //<--------LA PUEDO GENERAR GRACIAS AL NOMBRE DEL METODO DE ABAJO
   Optional<Student> findStudentByEmail(String email);   //METODO DEL REPOSITORIO, QUE PODRÁ HACER UNA CONSULTA SOBRE UN POSIBLE STUDENT basandose en el nombre del metodo
   //devuelve un Optional, que es un contenedor que puede o no contener un valor de tipo nulo (lo que devolvería la query si no hay ninguno con ese email)

   @Query("select s from Student s where s.id = ?1")
   Optional<Student> findStudentById(Long id);
}