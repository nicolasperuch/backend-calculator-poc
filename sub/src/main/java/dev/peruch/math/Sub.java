package dev.peruch.math;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
@CrossOrigin("http://localhost:4200")
public class Sub {


    @RequestMapping("sub/{a}/{b}")
    @ResponseBody
    public int execute(@PathVariable(value = "a") int a,
                       @PathVariable (value = "b") int b){
        return a - b;
    }

    @RequestMapping("health")
    @ResponseBody
    public int checkHealth(){
        return 200;
    }



}
