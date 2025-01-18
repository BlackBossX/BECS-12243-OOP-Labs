public class q7 {
    public static void main(String[] args) {

        String fName ="Kamala";
        String mName ="Sugarcane";
        String lName = "Perera";
        int age = 20*100;

        StringBuffer password = new StringBuffer().append(fName.toLowerCase().charAt(0)).append(mName.substring(0,2).toLowerCase()).append(lName.substring((lName.length()-3),lName.length()-1).toLowerCase()).append(age);
        System.out.println(password);


    }
}