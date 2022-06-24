package demo.app_user;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AppUserService {

    @Autowired
    private final AppUserRepository appUserRepository;

    public void addUser(AppUser user){
        appUserRepository.save(user);

    }

    public Collection<AppUser> getUsers(){
        return  appUserRepository.findAll();
    }
}
