package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.controller.ConstructorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6WebappApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Spring6WebappApplication.class, args);
        ConstructorController controller = ctx.getBean(ConstructorController.class);
        System.out.println("in Main Method");
        System.out.println(controller.sayHello());
    }

}
