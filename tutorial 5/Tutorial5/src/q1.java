public class q1 {
    public static void main(String[] args) {
        double purchase = Double.parseDouble(args[0]);
        double discount,total;

        discount = (purchase >5000)? 0.1:0.05;

        System.out.println("The purchase amount: "+purchase);
        System.out.println("The discount applied: "+(purchase*discount));
        System.out.println("The final amount after applying the discount: "+(purchase-(purchase*discount)));

    }
}