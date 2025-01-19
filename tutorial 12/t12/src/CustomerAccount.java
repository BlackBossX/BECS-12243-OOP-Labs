public class CustomerAccount {

    public static void main(String[] args) {
        Account acc = new Account(1, null);
        Customer cus1 = new Customer("kamal", acc);
        acc.owner = cus1;

        //System.out.println(cus1.name+" "+cus1.password+" "+cus1.account.number+" "+cus1.account.balance+" "+cus1.account.owner.name);
    }
}
