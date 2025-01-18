import java.util.Scanner;
import java.util.Arrays;
public class q6{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name:");String name = input.nextLine();
        System.out.print("Enter Age:");String age = input.nextLine();
        System.out.print("Enter Gender");String gender = input.nextLine();
        System.out.print("Enter weight(kg)");String w = input.nextLine();
        System.out.print("Enter height(m)");String h = input.nextLine();

        Double weight = Double.parseDouble(w);
        Double height = Double.parseDouble(h);

        double BMI = weight/(height*height);
        String BMItype;

        if(BMI>=30){
            BMItype ="Obesity";
        } else if (BMI>=25) {
            BMItype ="Overweight";
        } else if (BMI>=18.5) {
            BMItype ="Normal weight";
        } else {
            BMItype ="Underweight";
        }
        System.out.println("Hi "+name+"!");
        System.out.println("Here are your details:");
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Weight: "+weight+" kg");
        System.out.println("Height: "+height+" m");
        System.out.printf("BMI: %.2f\n",BMI);
        System.out.println("Category: "+BMItype);

    }
    }



