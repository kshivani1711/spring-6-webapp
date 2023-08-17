package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.services.GreentingService;
import guru.springframework.spring6webapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectionControllerTest {
    @Autowired
private SetterInjectionController setterInjectionController;


    @Test
    void sayHello() {
        System.out.println("Test");
        System.out.println(setterInjectionController.sayHello()); ;
    }
}