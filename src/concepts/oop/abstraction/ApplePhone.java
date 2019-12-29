package concepts.oop.abstraction;

public class ApplePhone extends SmartPhone {
    @Override
    public void setApplication() {
        this.application = "App store";
    }

    public void getOs() {
        System.out.println("ioS");
    }
}
