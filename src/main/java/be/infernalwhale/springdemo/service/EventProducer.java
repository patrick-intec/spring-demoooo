package be.infernalwhale.springdemo.service;

import java.util.List;

public class EventProducer {
    private List<Interested> interestedClasses;

    public void registerUser(String user) {
        interestedClasses.forEach(ic -> ic.newUserRegistered(user));
    }
}
