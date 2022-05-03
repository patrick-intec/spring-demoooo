package be.infernalwhale.springdemo.service;

import org.springframework.context.ApplicationEvent;

public class CustomApplicationEvent extends ApplicationEvent {
    public CustomApplicationEvent(String source) {
        super(source);
    }
}
