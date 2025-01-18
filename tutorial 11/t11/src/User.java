public class User {
    String name;
    String userID;

    public void login(){
        System.out.println("User " + this.name + " with ID "+ this.userID + " has logged in.");
    }
    public static void main(String[] args) {
        String [] SIn1 = {"Maths","Physics"};
        Instructor In1 = new Instructor("Malan","EC000",SIn1);
        String [] SSt1 = {"Maths","IT"};
        Student St1 = new Student("Alwis","EC012",SSt1);
        In1.login();
        St1.login();
        St1.viewCourses();
        In1.assignGrades(St1.name,"A");

    }
}

class Student extends User{
    String[] enrolledCourses;

    Student(String name,String userID,String [] enrolledCourses){
        this.name = name;
        this.userID = userID;
        this.enrolledCourses = enrolledCourses;
    }

    public void viewCourses(){
        System.out.print("Enrolled Courses : ");
        for(int i =0;i<enrolledCourses.length;i++){
            System.out.print(enrolledCourses[i]);
            if (i<(enrolledCourses.length -1) ){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

class Instructor extends  User{
    String []teachingCourses;

    Instructor(String name,String userID,String [] teachingCourses){
        this.name = name;
        this.userID = userID;
        this.teachingCourses = teachingCourses;
    }

    public void assignGrades(String StudentName, String grade){
        System.out.println("Instructor "+ this.name +" assigned grade "+
                grade +" to " + StudentName + " .");
    }

}
