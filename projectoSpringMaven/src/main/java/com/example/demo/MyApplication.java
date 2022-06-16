package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication //determina que es una spring boot application y carga por ejemplo una posible autoconfiguración
// no hizo falta esto al final (exclude={DataSourceAutoConfiguration.class})
 /*importante agregar esta exclusion para que tome la DB de application
properties*/
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    } //metodo de SpringApplication, permite correr una clase y recibir los argumentos originales.

}
