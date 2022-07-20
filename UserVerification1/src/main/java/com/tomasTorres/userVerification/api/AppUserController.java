package com.tomasTorres.userVerification.api;

import com.tomasTorres.userVerification.domain.AppUser;
import com.tomasTorres.userVerification.service.AppUserService;
import com.tomasTorres.userVerification.service.AppUserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/AppUser")
@RequiredArgsConstructor
public class AppUserController {

    private AppUserService appUserService;

    @GetMapping("/all")
    public ResponseEntity<List<AppUser>> getUsers(){
        return ResponseEntity.ok().body(appUserService.getUsers());
    }




}
