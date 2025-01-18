public class q2 {
    public static double total;
    public static double avg;
    public static int p=0;
    public static void main(String[] args) {
        double[][] weights = {{54.5, 50, 48}, {43, 56.5, 67, 65.5, 59}, {45, 55, 63, 45.5, 54.5},
                {66, 49.5, 56}};

        for(double[] x:weights){
            p++;
            for(double y: x){
                total = total +y;
            }
            System.out.printf("Group %d Average Weight: %.2f\n",p,(total/x.length));
            total=0;
        }
        }
    }
