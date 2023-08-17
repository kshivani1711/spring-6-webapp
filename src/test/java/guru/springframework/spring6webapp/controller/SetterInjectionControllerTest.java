package guru.springframework.spring6webapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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