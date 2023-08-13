package dp.observer_07;

public class SmsNotificationSender implements PriceObserver{
    @Override
    public void onPriceDrop() {
        // Send sms on product price change notification
        System.out.println("SMS sent");
    }
}
