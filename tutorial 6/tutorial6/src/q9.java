import  java.util.Scanner;
public class q9{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no1 : ");
        double no1 = input.nextDouble();
        System.out.print("Enter no2 : ");
        double no2 = input.nextDouble();
        System.out.print("Enter Operation : ");
        char operation = input.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println("Output: "+(no1+no2));
                break;
            case '-':
                System.out.println("Output: "+(no1-no2));
                break;
            case '*':
                System.out.println("Output: "+(no1*no2));
                break;
            case '/':
                if(no2==0){
                    System.out.println("Division by zero is not allowed.");
                    break;
                }
                System.out.println("Output: "+(no1/no2));
                break;
            case '%':
                System.out.println("Output: "+(no1%no2));
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}

