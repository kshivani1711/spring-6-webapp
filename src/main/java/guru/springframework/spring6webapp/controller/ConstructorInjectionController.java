package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private final GreetingService greetingService;

    public ConstructorInjectionController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        System.out.println("Inside my controller");
        return greetingService.sayGreeting();
    }
}
