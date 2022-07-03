package demo.response;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/response")
public class ResponseController {

    @PostMapping
    public String showResponse(@RequestBody Response response){
        System.out.println( response.toString());
        return  "todo bien";
    }
}
