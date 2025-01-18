public class Account {
    String accountNumber;
    String accountHolderName;
    double balance;


    public double deposit(double amount){
        balance = amount+balance;
        System.out.println("After Deposit Blance : " + balance);
        return balance;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Holder Name : " + this.accountHolderName);
        System.out.println("Balance : " + this.balance);
    }
}

class SavingsAccount extends Account{
    double interestRate;

    SavingsAccount( String accountNumber,String accountHolderName,double balance,double interestRate){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double withdraw(double amount){
        if(balance>=amount){
            balance = balance - amount;
            System.out.println("New Balance is : " + balance);
        }else{
            balance= balance;
            System.out.println("Balance is insufficient.");
        }
        return balance;
    }

    public double applyInterest(){
        balance = balance + balance * interestRate/100;
        System.out.println("New Balance after applying Interest : " + balance);
        return balance;
    }

}

class CurrentAccount extends Account{
    double creditLimit;



    CurrentAccount( String accountNumber,String accountHolderName,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public double setCreditLimit(double limit){
        this.creditLimit = limit;
        return this.creditLimit;
    }
    public double withdraw(double amount){
        if(creditLimit>=amount){
            creditLimit = creditLimit - amount;
            System.out.println("New Credit Limit is : " + creditLimit);
        }else{
            creditLimit= creditLimit;
            System.out.println("Credit Limit is insufficient.");
        }
        return creditLimit;
    }
}
