package concepts.oop.abstraction;

public class TestPhone {

    public static void main(String[] args) {
        ApplePhone iPhoneX = new ApplePhone();
        iPhoneX.getOs();
        iPhoneX.setApplication();
        iPhoneX.sendCall(12348392);
    }
}
