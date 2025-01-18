import java.util.Scanner;
public class q4{
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter Date like this (december 8, 2024):");
        String date = input.nextLine();
/*
        StringBuilder sb = new StringBuilder(date);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
*/
        date=date.trim();
        System.out.println(date);
        System.out.println(date.indexOf(" "));
        System.out.println(date.indexOf(","));
        String[] newarr = date.split(" ");
        System.out.println("Month: "+newarr[0]);
        System.out.println("date: "+newarr[1].replace(",",""));
        System.out.println("Year: "+newarr[2]);
        char first = Character.toUpperCase(date.charAt(0));
        String others = date.substring(1,8);
        System.out.println(first);
        System.out.println(others);







    }
}

