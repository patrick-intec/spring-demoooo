package be.infernalwhale.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InterestedClass1 {
    @Autowired
    private ApplicationEventPublisher publisher;

    @EventListener
    public void shitToDoWhenEventComesIn(CustomApplicationEvent event) {
        // Handle the event....
        System.out.println("InterestedClass1 is handling: " + event);
        this.publisher.publishEvent("Another event....");
    }

    @EventListener
    public void somethingElseHappened(CustomApplicationEvent2 event2) {

    }
}
