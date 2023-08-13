package dp.observer_03;

public class EmailNotificationSender implements PriceObserver{
    @Override
    public void onPriceDrop() {
        // Send email notification on product price change notification
        System.out.println("Email sent");
    }
}
