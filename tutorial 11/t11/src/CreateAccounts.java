public class CreateAccounts {
    public static void main(String[] args) {
        SavingsAccount S1 = new SavingsAccount("2021","Malan",5000,5);
        CurrentAccount C1 = new CurrentAccount("2022","Alwis",20000);
        C1.setCreditLimit(5000);
        System.out.println(S1.accountNumber);
        System.out.println(S1.accountHolderName);
        System.out.println(S1.balance);
        System.out.println(S1.interestRate);
        System.out.println();
        System.out.println(C1.accountNumber);
        System.out.println(C1.accountHolderName);
        System.out.println(C1.balance);
        System.out.println(C1.creditLimit);
        System.out.println();
        S1.deposit(20000);
        S1.withdraw(30000);
        S1.withdraw(3000);
        System.out.println();
        System.out.println(S1.accountNumber);
        System.out.println(S1.accountHolderName);
        System.out.println(S1.balance);
        System.out.println(S1.interestRate);
        System.out.println();
        S1.applyInterest();
        System.out.println();
        C1.withdraw(6000);
        C1.withdraw(5000);
        System.out.println();
        System.out.println(C1.accountNumber);
        System.out.println(C1.accountHolderName);
        System.out.println(C1.balance);
        System.out.println(C1.creditLimit);




    }
}
