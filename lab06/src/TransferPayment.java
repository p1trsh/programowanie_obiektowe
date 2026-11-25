public class TransferPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Transfer payment for " + amount);
    }
}
