public class Main {
    private static int x=0;
    private static int count,count1=0;
    public static void main(String[] args) {

        double[][] temperatures = {
                {36.5, 36.7, 37.1, 36.8, 36.6, 37.0, 36.9},
                {38.2, 37.8, 38.0, 37.0, 37.5, 38.1, 37.6},
                {36.4, 36.3, 36.5, 36.2, 36.6, 36.7, 36.8}
        };

        for(double[] patient:temperatures){
            for (double daytemp : patient){
                if(daytemp >=37.5) {
                    //System.out.println(daytemp);
                    count++;
                }else{
                    count1++;
                    //System.out.println("Patient " + x + " had no fever");
                }


            }
            x++;
           // System.out.println(count1);
            if (count==0){
                System.out.println("Patient " + x + " had no fever");
                //continue;
            }else{
                System.out.println("Patient " + x + " had a fever "+count+" times");
            }
            count =0;
            count1=0;


        }
    }
}