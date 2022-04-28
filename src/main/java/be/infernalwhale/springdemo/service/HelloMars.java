package be.infernalwhale.springdemo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class HelloMars implements StringProvider {
    @Override
    public String gievString() {
        System.out.println("Creating Hello Mars");
        return "Hello Mars";
    }
}
