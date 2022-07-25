package com.tomasTorres.userVerification.api;

import com.tomasTorres.userVerification.domain.AppUser;
import com.tomasTorres.userVerification.domain.Role;
import com.tomasTorres.userVerification.service.AppUserService;
import com.tomasTorres.userVerification.service.AppUserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/AppUser")
@AllArgsConstructor
public class AppUserController {
    @Autowired
    private AppUserServiceImpl appUserService;

    @GetMapping(path = "{AppUserId}")
    public ResponseEntity<AppUser   > getUsers(@PathVariable("AppUserId")Long id){
        return ResponseEntity.ok().body(appUserService.getUserById(id));
    }

    @GetMapping("/**")
    public ResponseEntity<List<AppUser>> getUsers(){
        return ResponseEntity.ok().body(appUserService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<?> saveUser(@RequestBody AppUser user){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/AppUser/user/save").toUriString());
        return ResponseEntity.created(uri).body(appUserService.saveUser(user));
    }
    @PostMapping(/role/save)
    public ResponseEntity<?> saveRole(@RequestBody Role role){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/AppUser/role/save").toUriString());
        return ResponseEntity.created(uri).body(appUserService.saveRole(role));
    }



}
