package com.tomas.demo.user;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AppUserService {

    @Autowired
    private final AppUserRepository appUserRepository;

    public List<AppUser> getUsers(){
        return appUserRepository.findAll();
    }

    public AppUser getOneUser (Long id){

        AppUser appUser = appUserRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("No user with that id"));

        return  appUser;
    }


}
