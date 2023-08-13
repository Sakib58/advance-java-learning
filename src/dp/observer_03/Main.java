package dp.observer_03;

public class Main {
    public static void main(String[] args) {
        Product iPhone13 = new Product("iPhone 13", 140000);
        EmailNotificationSender emailNotificationSender = new EmailNotificationSender();
        SmsNotificationSender smsNotificationSender = new SmsNotificationSender();
        iPhone13.addObserver(emailNotificationSender);
        iPhone13.addObserver(smsNotificationSender);
        iPhone13.setNewProductPrice(135000);
    }
}
