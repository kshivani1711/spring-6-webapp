package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6WebappApplicationTests {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    MyController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }

}
