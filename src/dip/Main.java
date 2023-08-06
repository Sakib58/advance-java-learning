package dip;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        Bank bank = new Bank(emailSender);
        bank.transferFund();

        SmsSender smsSender = new SmsSender();
        Bank bank1 = new Bank(smsSender);
        bank1.transferFund();
    }
}
