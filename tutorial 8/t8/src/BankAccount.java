public class BankAccount {
    String name;
    double balance;

    BankAccount() {
        name = null;
        balance = 0;
    }
    BankAccount(String name,double balance) {
        this.name = name;
        this.balance = balance;

    }

    public void getName(){
        System.out.println(name);
    }

    public void getBalance(){
        System.out.println(balance);
    }

    public void deposit(double amount){
        balance = balance+amount;
    }

    public void withdraw(double amount){
        balance = balance-amount;
    }

    public String displayInfo(){
        return name + ", RS." + balance;
    }


}
class BankAccountClient {
    public static void main(String[] args) {

        BankAccount B1 = new BankAccount("peter",10000);

        B1.deposit(8000);
        B1.getBalance();
        B1.withdraw(3000);
        System.out.println(B1.displayInfo());

        BankAccount B2 = new BankAccount();
        B2.getName();
        B2.getBalance();



    }
}


