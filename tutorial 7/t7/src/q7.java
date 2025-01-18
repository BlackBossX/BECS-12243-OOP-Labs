import java.util.Scanner;
public class q7{
    private static int q=1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int x=1;x<=20;x++){
            if((x%5==0)){
                System.out.println("Loop terminated.");
                break;
            }
            System.out.println(x);
        }
        System.out.println("");
        System.out.println("--b part--");
        for(int x=1;x<=20;x++){
            if((x%2==1)){
                continue;
            }
            System.out.println(x);
        }

    }
}
