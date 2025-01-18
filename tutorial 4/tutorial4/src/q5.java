public class q5 {
    public static void main(String[] args) {

        double initialBalance = Double.parseDouble(args[0]);
        double depositAmount = Double.parseDouble(args[1]);
        double withdrawalAmount = Double.parseDouble(args[2]);

        double finalBalance = initialBalance + depositAmount - withdrawalAmount;

        System.out.println("-----------------------------------------------");
        System.out.println("            Bank Account Summary               ");
        System.out.println("-----------------------------------------------");

        System.out.printf("Initial Balance:    %.2f\n",initialBalance);
        System.out.printf("Deposit Amount:     %.2f\n",depositAmount);
        System.out.printf("Withdrawal Amount:  %.2f\n",withdrawalAmount);

        System.out.println("-----------------------------------------------");
        System.out.printf("Final Balance:      %.2f\n",finalBalance);
        System.out.println("-----------------------------------------------");

    }
}