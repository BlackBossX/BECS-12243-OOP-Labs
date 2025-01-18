import java.util.Scanner;
public class q6{
    private static int q=1;

    public static int getTriangleNumber(int n) {
        return 2*n-1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your no: ");
        int no = input.nextInt();
        String space =" ";
        String star ="*";
        int p=no;

        for(int i=q;p>=q;i++){
            for(int x=(p-q);x>0;x--){
                System.out.print(space);
            }
            System.out.print(star.repeat(getTriangleNumber(i)));
            System.out.println("") ;
            q++;
        }
    }
}
