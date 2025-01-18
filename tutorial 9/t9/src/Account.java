public class Account {

    String ID;
    String name;
    double balance;

    Account(String ID,String name){
        this.ID=ID;
        this.name=name;
    }

    Account(String ID,String name,double balance){
        this.ID=ID;
        this.name=name;
        this.balance=balance;
    }

    void getID(){
        System.out.println(ID);
    }
    void getName(){
        System.out.println(name);
    }
    void getBalance(){
        System.out.println(balance);
    }


    double credit(double amount){
       return balance += amount;
    }

    void debit(double amount){
        if (amount <balance){
            System.out.println( balance -= amount);
        }else{
            System.out.println("Amount exceed Balance");
        }
    }

    void transferTo(Account p ,double amount){
        if (amount <balance){
            balance -= amount;
            p.balance += amount;

        }else{
            System.out.println("Amount exceed Balance");
        }
    }

    void displayInfo(){
        System.out.println("User ID: "+this.ID+" Name: "+this.name+" Balance: "+this.balance);

    }

}
