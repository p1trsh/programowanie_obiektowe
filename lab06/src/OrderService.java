public class OrderService {
    PaymentMethod paymentMethod;

    public OrderService(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    void checkout(double amount){
        paymentMethod.pay(amount);
    }
}
