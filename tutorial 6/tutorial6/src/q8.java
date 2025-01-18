import  java.util.Scanner;
public class q8{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Day Value: ");
        int value = input.nextInt();

        switch (value){
            case 1:
                System.out.println(value+" is Monday ");
                break;
            case 2:
                System.out.println(value+" is Tuesday ");
                break;
            case 3:
                System.out.println(value+" is Wednesday ");
                break;
            case 4:
                System.out.println(value+" is Thursday ");
                break;
            case 5:
                System.out.println(value+" is Friday ");
                break;
            case 6:
                System.out.println(value+" is Saturday ");
                break;
            case 7:
                System.out.println(value+" is Sunday ");
                break;
        }
        }
    }

