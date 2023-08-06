package dip;

public class EmailSender implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Transaction Email send successful!");
    }
}
