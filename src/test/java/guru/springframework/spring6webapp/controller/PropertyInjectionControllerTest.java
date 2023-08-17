package guru.springframework.spring6webapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectionControllerTest {

    @Autowired
    PropertyInjectionController propertyInjectionController;

    @Test
    void sayHello() {
        System.out.println(propertyInjectionController.sayHello());
    }
}