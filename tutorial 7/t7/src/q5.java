import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your no: ");
        int no = input.nextInt();
        //int no = 5;
        int p=no;

        for(int i=p;i>0;i--){
            for(int x=1;x<=i;x++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
