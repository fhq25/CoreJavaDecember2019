package concepts.oop.abstraction;

public abstract class SmartPhone implements Phone {

    public String application;

    @Override
    public boolean sendCall(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
        return true;
    }

    @Override
    public boolean receiveCall() {
        System.out.println("Received call");
        return true;
    }

    public abstract void setApplication();

    public void sendMessage(String message) {
        System.out.println("Sent: " + message);
    }
}
