import java.util.Date;
public class q8{
    private static int q=1;
    public static void main(String[] args) {

        Date d1 = new Date();
        if (d1.getHours()<12){
            System.out.println("Morning");
        } else if (d1.getHours()<18) {
            System.out.println("Day");
        }else{
            System.out.println("Night");
        }


    }
}
