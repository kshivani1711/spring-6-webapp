package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.services.GreentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
  @Autowired
  GreentingService greentingService;

    public String sayHello(){
      return greentingService.sayGreeting();
    }
}
