public class BlikPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("blik payment for " + amount);
    }
}
