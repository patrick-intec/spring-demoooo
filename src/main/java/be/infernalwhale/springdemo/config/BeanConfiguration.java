package be.infernalwhale.springdemo.config;

import be.infernalwhale.springdemo.service.*;
import org.springframework.context.annotation.*;

/**
 *   PEBCAK: Problem Exists Between Chair And Keyboard
 *   ID10T
 *   Layer 8 problems: OSI model
 *   EPP: External Process Problem
 */

@Configuration
public class BeanConfiguration {

    @Bean
    public StringPrinter printer(StringProvider provider) {
        StringPrinter printer = new StringPrinter(provider);
        printer.print();
        return printer;
    }

    @Bean
    public AnotherSpringPrinter anotherPrinter(StringProvider provider) {
        return new AnotherSpringPrinter(provider);
    }

    @Bean
    @Scope("prototype")
    @Profile("production")
    public StringProvider provider1() {
        return new HelloWorld();
    }

    @Bean
    @Scope("prototype")
    @Profile("disabledisable")
    public StringProvider provider2() {
        return new HelloMars();
    }
}
