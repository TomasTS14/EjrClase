package com.tomas.demo.registration;

import com.tomas.demo.email.EmailSender;
import com.tomas.demo.email.EmailService;
import com.tomas.demo.user.AppUser;
import com.tomas.demo.user.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserRepository appUserRepository;
    private  final EmailValidator emailValidator;
    private final ConfirmationTokenService confirmationTokenService;//todo
    private final EmailSender emailSender;


    public String register(RegistrationRequest request) {

        return null;
    }
}
