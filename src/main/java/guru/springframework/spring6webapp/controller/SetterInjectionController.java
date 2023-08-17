package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.services.GreentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    @Autowired
    private GreentingService greentingService;

    public String sayHello(){
        System.out.println("Testing");
        return greentingService.sayGreeting();
    }


}
