public class BankAcc {
    String Member;
    Double Amount = 0.00;

    public BankAcc(){
        this.Amount = 0.00 ;
    }

    public BankAcc(double Amount){
        this.Amount = this.Amount + Amount;
    }
    public static void main(String[] args) {
        BankAcc B1 = new BankAcc(1000);
        System.out.println("Amount : " + B1.Amount);
    }
}
