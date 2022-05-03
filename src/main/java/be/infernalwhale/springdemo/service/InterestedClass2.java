package be.infernalwhale.springdemo.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InterestedClass2 {
    @EventListener
    public void newUserRegistered(CustomApplicationEvent user) {
        System.out.println("Interested class no2 is handling: " + user);
    }
}
