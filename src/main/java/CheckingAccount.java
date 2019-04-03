abstract class CheckingAccount extends account {

    public CheckingAccount(double pin, String name, double balance) {super(pin, name, balance);}
    public abstract double checkBalance();
}
