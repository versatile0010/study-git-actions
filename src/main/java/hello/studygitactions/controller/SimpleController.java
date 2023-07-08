package hello.studygitactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/first")
    public String helloWorld(){
        return "Hello world!";
    }
}
