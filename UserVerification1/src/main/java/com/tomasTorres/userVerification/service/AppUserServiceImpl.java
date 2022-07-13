package com.tomasTorres.userVerification.service;

import com.tomasTorres.userVerification.domain.AppUser;
import com.tomasTorres.userVerification.domain.Role;
import com.tomasTorres.userVerification.repo.AppUserRepo;
import com.tomasTorres.userVerification.repo.RoleRepo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor //sirve para hacer autowired de todos los campos final
@Transactional //PERMITE HACER CAMBIOS, ESCRIBIR EN LA BASE.
@Slf4j
public class AppUserServiceImpl implements  AppUserService {


    private final AppUserRepo userRepo;
    private final RoleRepo roleRepo;


    @Override
    public AppUser saveUser(AppUser user) {
        log.info("Saving new user {} to the db", user.getName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

        AppUser user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
        //Gracias al @Transactional puedo escirbir como en una referencia del objeto rol que me trae el repo.
        //Asi sin select statements, o update. Trabajo directo sobre el objeto
    }

    @Override
    public AppUser getUser(String username) {
       return  userRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        return userRepo.findAll();
    }
}
