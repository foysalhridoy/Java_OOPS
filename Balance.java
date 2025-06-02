//Encapsulation
class Account {
    private int balance;

    public void setBalance(int b) {
        if (b > 0)
            balance = b;
    }

    public int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
