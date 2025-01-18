import java.util.Scanner;
public class q2 {
    private static int x = 0;
    private static int count, count1 = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            if (age >= 65) {
                System.out.println("You are also eligible for senior citizen benefits.");
            } else {
                System.out.println("You are not eligible for senior citizen benefits.");
            }
        }else{
            System.out.println("You are not eligible to vote.");
            }


        }
    }
