public class CardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("card payment for " + amount);
    }
}
