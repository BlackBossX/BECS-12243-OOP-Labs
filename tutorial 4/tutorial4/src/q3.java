public class q3 {
    public static void main(String[] args) {

        double item1Price = Double.parseDouble(args[0]);
        double item2Price = Double.parseDouble(args[1]);
        double item3Price = Double.parseDouble(args[2]);

        double TotalCost = item1Price+ item2Price +item3Price;
        double DISCOUNT_RATE = 0.15;
        double discountAmount = TotalCost * DISCOUNT_RATE;
        double finalAmount = TotalCost - discountAmount;

        System.out.println("-----------------------------------------------");
        System.out.println("                 Grocery Bill                  ");
        System.out.println("-----------------------------------------------");

        System.out.printf("Item 1 Price:   %.2f\n", item1Price);
        System.out.printf("Item 2 Price:   %.2f\n", item2Price);
        System.out.printf("Item 3 Price:   %.2f\n", item3Price);

        System.out.println("-----------------------------------------------");

        System.out.printf("Total Cost:     %.2f\n", TotalCost);
        System.out.println("Discount (15%):       -15.00" );

        System.out.println("-----------------------------------------------");

        System.out.printf("Final Amount:   %.2f\n", finalAmount);

        System.out.println("-----------------------------------------------");

    }
}