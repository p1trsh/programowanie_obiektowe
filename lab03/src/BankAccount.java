public class BankAccount {
    private String owner;
    private double balance;

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double value){
        if (value > 0){
            balance += value;
            System.out.println("wykonano depozyt na kwotę: " + value);
        }
    }

    public void withdraw(double value){
        if (value <= balance && value > 0){
            balance -= value;
            System.out.println("wykonano depozyt kwoty: " + value);
        }
    }
}
