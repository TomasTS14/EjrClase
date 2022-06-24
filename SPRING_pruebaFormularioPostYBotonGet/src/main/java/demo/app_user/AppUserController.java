package demo.app_user;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "api/app_user")
@AllArgsConstructor
public class AppUserController {
    @Autowired
    private  final AppUserService service;

    @PostMapping
    public void addAppUser (@RequestBody AppUser appUser){
        System.out.println(appUser);
        service.addUser(appUser);
        //TODO: tengo que traducir esto a un request que pueda ser leido, revisar loginEmailApp.
    }

    @GetMapping
    public Collection<AppUser> getUsers(){
        return service.getUsers();
    }


}
