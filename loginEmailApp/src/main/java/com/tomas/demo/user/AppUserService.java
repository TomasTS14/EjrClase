package com.tomas.demo.user;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService{ //importante!!! tambien en la clase de usuario propia. {

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
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return appUserRepository.findAppuserByEmail(username).orElseThrow(()-> new UsernameNotFoundException("usr not found"));
    }

    public



}
