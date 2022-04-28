package be.infernalwhale.springdemo.service;

public class HelloWorld implements StringProvider {

    @Override
    public String gievString() {
        System.out.println("Creating a HelloWorld StringProvider");
        return "Hello World...";
    }
}
