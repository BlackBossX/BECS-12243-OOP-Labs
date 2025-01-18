import java.util.Scanner;
import java.util.Arrays;
public class q5{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first String:");
        String name1 = input.nextLine();
        System.out.print("Enter second String:");
        String name2 = input.nextLine();

        String[] arr = {name1,name2};
        Arrays.sort(arr);
        System.out.println("Ordered Strings: "+arr[0]+", "+arr[1]);
        }
    }


