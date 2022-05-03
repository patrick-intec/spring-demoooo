package be.infernalwhale.springdemo;

import be.infernalwhale.springdemo.service.SpringEventProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
        SpringApplication.run(SpringDemoApplication.class, args);

        SpringEventProducer sep = ctx.getBean(SpringEventProducer.class);
        sep.registerUser("Ali enters the room....");

        ctx.close();
    }

}
