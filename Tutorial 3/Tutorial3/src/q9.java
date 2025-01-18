/*

this program made to print students information and also
their marks such as maths , science , history
and also their total marks and average marks

*/


public class q9 {
    public static void main(String[] args) {
        String fName="John"; // assigned the Jhon name to fName variable
        String lName="Doe"; // assigned the Doe name to lName variable
        int age=20; //assigned 20 to age variable
        double mathsMarks=85.5; //assigned maths marks to mathsMarks variable
        double scienceMarks=92.0; //assigned science marks to scienceMarks variable
        double historyMarks=78.5; //assigned history marks to historyMarks variable

        double totalMarks = mathsMarks + scienceMarks + historyMarks; // calculate the total marks
        double avgMarks = totalMarks/3; // calculate the average of the 3 subjects


        System.out.println("Student Information"); // print
        System.out.println("-------------------\n"); // print

        System.out.println("First Name: "+fName); // print txt + variable value
        System.out.println("Last Name:  "+lName); // print txt + variable value
        System.out.println("Age:        "+age); // print txt + variable value

        System.out.println("Marks: "); // print txt
        System.out.println("    Maths:    "+mathsMarks); // print txt + variable value
        System.out.println("    Science:  "+scienceMarks); // print txt + variable value
        System.out.println("    History:  "+historyMarks); // print txt + variable value
        System.out.println();

        System.out.println("Total Marks:    "+totalMarks); // print txt + variable value
        System.out.println("Average Marks:  "+avgMarks); // print txt + variable value
    }
}