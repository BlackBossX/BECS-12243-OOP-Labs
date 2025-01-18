public class q10 {
    public static void main(String[] args) {
        String txt = "ICS 102: Introduction to Computing I";

        String[] arr = txt.split(" ");
        String[] sec =arr[1].split(":");
        System.out.println("Course Name: "+arr[0]);
        System.out.println("Course Number: "+sec[0]);
        System.out.println("Course Description: "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);



    }
}