package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.controller.MyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6WebappApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Spring6WebappApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);
        System.out.println("in Main Method");
        System.out.println(controller.sayHello());
    }

}
