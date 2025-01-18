import java.util.Scanner;
public class q1 {

    public static String calculateGrade(int s){
        if (s>=90){
          return "Your grade is: A" ;
        } else if (s>=80) {
            return "Your grade is: B";
        }else if(s<=70 &&s>=0){
            return "Your grade is: C";
        }else{
            return "Error: Please enter a score between 0 and 100.";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter NO: ");
        int no = input.nextInt();

        System.out.print(calculateGrade(no));


    }
}