package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.services.GreentingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private final GreentingService greetingService;

    public ConstructorController(GreentingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        System.out.println("Inside my controller");
        return greetingService.sayGreeting();
    }
}
