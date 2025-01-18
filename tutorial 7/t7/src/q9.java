import java.util.Scanner;
public class q9{
    private static int q=1;
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();

            double pi =Math.PI;
            double area = pi*Math.pow(radius,2);
            double circumference =2*pi*radius;

            System.out.printf("Area: %.2f\n",area);
            System.out.printf("Circumference: %.2f",circumference);



    }
}
