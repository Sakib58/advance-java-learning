package dip;

public class Bank {
    private NotificationSender notificationSender;
    public Bank(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }
    public void transferFund() {
        System.out.println("Fund transferring ........");
        System.out.println("Fund transferring completed");
        notificationSender.sendNotification();
    }
}
