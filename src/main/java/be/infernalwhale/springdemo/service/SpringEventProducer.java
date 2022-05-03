package be.infernalwhale.springdemo.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SpringEventProducer {
    private ApplicationEventPublisher publisher;

    public SpringEventProducer(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void registerUser(String user) {
        this.publisher.publishEvent(new CustomApplicationEvent(user));
    }
}
