package com.tomasTorres.userVerification.api;

import com.tomasTorres.userVerification.domain.AppUser;
import com.tomasTorres.userVerification.service.AppUserServiceImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class RootController {

    private final AppUserServiceImpl appUserService;

    @GetMapping()
    public String getAuthUser(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        AppUser user = appUserService.getUser(auth.getName());

        return String.format("Hello %s , have a nice day", user.getName());
    }

    @RequiredArgsConstructor
    @Getter
    @ToString
    public class FormLogin{
        private final String username;
        private final String password;
    }
}
