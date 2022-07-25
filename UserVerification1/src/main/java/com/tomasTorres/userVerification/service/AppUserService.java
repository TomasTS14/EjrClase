package com.tomasTorres.userVerification.service;

import com.tomasTorres.userVerification.domain.AppUser;
import com.tomasTorres.userVerification.domain.Role;

import java.util.List;
import java.util.Optional;

public interface AppUserService {
    //utilizo una interfaz para poder implementarlo de distintas formas en el futuro si hiciese falta

    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    AppUser getUserById(Long id);
    List<AppUser> getUsers();
}
