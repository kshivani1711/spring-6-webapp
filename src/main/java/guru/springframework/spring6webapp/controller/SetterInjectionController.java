package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        System.out.println("Testing");
        return greetingService.sayGreeting();
    }


}
