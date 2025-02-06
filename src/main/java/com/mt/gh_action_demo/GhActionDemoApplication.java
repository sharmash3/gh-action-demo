package com.mt.gh_action_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GhActionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhActionDemoApplication.class, args);
	}

}
@RestController
class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
}