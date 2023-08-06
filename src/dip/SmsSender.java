package dip;

public class SmsSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Transaction SMS send successful!");
    }
}
