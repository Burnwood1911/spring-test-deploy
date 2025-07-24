package xyz.alexrossi.spring_test_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String showGreeting() {
        return "Hello! We love Paketo buildpacks!";
    }
}