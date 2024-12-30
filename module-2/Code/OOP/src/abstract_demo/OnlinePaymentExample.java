package abstract_demo;

abstract class Payment {
    String accountName;

    Payment(String accountName){
        this.accountName = accountName;
    }

    abstract void processPayment();

    void showConfirmation(double amount){
        System.out.println("Payment of " + amount + " has been processed for "+ accountName);
    }
}

class CreditCardPayment extends Payment{
    private String cardNumber;

    CreditCardPayment(String accountName, String cardNumber){
        super(accountName);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment of "+ accountName+ " for credit card" + cardNumber);
    }
}

public class OnlinePaymentExample {

    public static void main(String[] args) {
        CreditCardPayment creditCard1 = new CreditCardPayment("saving", "1234-0000");
        creditCard1.processPayment();
        creditCard1.showConfirmation(12);

    }
}
