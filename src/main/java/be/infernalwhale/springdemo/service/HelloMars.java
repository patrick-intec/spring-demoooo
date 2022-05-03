package be.infernalwhale.springdemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloMars implements StringProvider {
    @Override
    public String gievString() {
        System.out.println("Creating Hello Mars");
        return "Hello Mars";
    }
}
