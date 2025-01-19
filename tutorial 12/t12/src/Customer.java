class Customer {
    String name;
    private int password;
    Account account;

    Customer(String name, Account account) {
        this.name = name;
        this.account = account;
        this.password = genPassword();
    }

    private int genPassword() {
        return (int)(Math.random()*1000);
    }

}