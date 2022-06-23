package com.tomas.demo.user;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
//NADA DE ESTO HACE FALTA, PARECE QUE NO ES ACCESIBLE PORQUE EL SISTEMA
//DE JAVA MAIL EVITA LAS REQUEST DE USUARIOS NO AUTENTIFICADOS.
@RestController
@RequestMapping(path = "api/v1/user")
@AllArgsConstructor

public class AppUserController {

    @Autowired
    private final AppUserService appUserService;

    @GetMapping
    public Collection<AppUser> getUsers(){
        return appUserService.getUsers();
    }
}
