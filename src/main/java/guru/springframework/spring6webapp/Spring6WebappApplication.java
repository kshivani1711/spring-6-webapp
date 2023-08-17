package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.controller.ConstructorInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6WebappApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Spring6WebappApplication.class, args);
        ConstructorInjectionController controller = ctx.getBean(ConstructorInjectionController.class);
        System.out.println("in Main Method");
        System.out.println(controller.sayHello());
    }

}
