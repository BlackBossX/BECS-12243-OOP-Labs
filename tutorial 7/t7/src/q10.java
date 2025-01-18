public class q10{

    static void printRange(int x, int y){

        if(x>y){
            for (int i=x;i>=y;i--) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }else {
            for (int i=x;i<=y;i++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

        }
    public static void main(String args[]){
        printRange(2,8);
        printRange(17,10);
        printRange(5,5);

    }
}


