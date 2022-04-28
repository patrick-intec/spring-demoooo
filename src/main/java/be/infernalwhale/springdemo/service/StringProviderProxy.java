package be.infernalwhale.springdemo.service;

public class StringProviderProxy implements StringProvider {
    private StringProvider provider;

    @Override
    public String gievString() {
        this.provider = new HelloMars();
        return this.provider.gievString();
    }
}
