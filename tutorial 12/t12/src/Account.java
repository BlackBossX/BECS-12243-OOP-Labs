class Account {
    int number;
    Customer owner;
    private double balance;

    Account(int number, Customer owner) {
        this.number = number;
        this.owner = owner;
        this.balance = 0;
    }
}