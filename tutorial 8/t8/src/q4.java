import java.util.Scanner;
public class q4 {
    String name;
    double price;
    double discount;

     public String initialize(String n,double p,double d) {
         this.name = n;
         this.price=p;
         this.discount =d;
        double newPrice = p-(p*(d/100));
        return "Final price: "+newPrice;
      //  System.out.println("Final price: "+newPrice);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        q4 newObject = new q4();

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.print("Enter discount: ");
        double discount = input.nextDouble();

        System.out.print(newObject.initialize(name,price,discount));

    }
}



