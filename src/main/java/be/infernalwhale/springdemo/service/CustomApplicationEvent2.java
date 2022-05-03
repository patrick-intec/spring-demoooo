package be.infernalwhale.springdemo.service;

import org.springframework.context.ApplicationEvent;

public class CustomApplicationEvent2 extends ApplicationEvent {
    public CustomApplicationEvent2(String source) {
        super(source);
    }
}
