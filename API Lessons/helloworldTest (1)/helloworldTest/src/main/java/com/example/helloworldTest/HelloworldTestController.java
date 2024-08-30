package com.example.helloworldTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/hello-world")
public class HelloworldTestController {

    @GetMapping
    public List<Greeting> hello() {
        return List.of(
                new Greeting("Hello", "World")
        );
    }
}
