public class account {


    private double pin;
    private String name;
   private double balance;

    public account(double pin, String name, double balance) {
        this.pin = pin;
        this.name = name;
        this.balance = balance;

    }

    public double getPin() {
        return pin;
    }

    public void setPin(double pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double setBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;

    }


        public double checkBalance() {return balance;}
        public double addTwentyDollars() {return balance + 20;}
        public double setToZero() {return balance - balance;}


}
