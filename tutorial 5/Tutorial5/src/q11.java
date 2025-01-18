public class q11 {
    public static void main(String[] args) {
        String txt1 = "Niroshan Perera";
        String txt2 = "Kamal Alwis";

        String[] txt1Split = txt1.split(" ");
        String[] txt2Split = txt2.split(" ");
        System.out.println(txt1Split[0]+" "+txt2Split[1]);
        System.out.println(txt2Split[0]+" "+txt1Split[1]);



    }
}