import  java.util.Scanner;
public class q7 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Character: ");
    char  letter = input.next().charAt(0);

        if (Character.isLowerCase(letter)) {
            char letter1= Character.toUpperCase(letter);
            System.out.println("You entered a lowercase letter "+letter+".Converted to uppercase: "+letter1);
        }else if(Character.isUpperCase(letter)){
            char letter1= Character.toLowerCase(letter);
            System.out.println("You entered a uppercase letter "+letter+".Converted to lowercase: "+letter1);
        }else{
            char letter1= Character.toLowerCase(letter);
            System.out.println("You entered "+letter+". which is not an alphabet.");
        }
    }
}

