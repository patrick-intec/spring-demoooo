package be.infernalwhale.springdemo.service;

public class AnotherSpringPrinter {
    private StringProvider stringProvider;

    public AnotherSpringPrinter(StringProvider provider) {
        System.out.println("Creating another String Printer");
        this.stringProvider = provider;
    }

    public void print() {
        System.out.println(stringProvider.gievString());
    }
}
