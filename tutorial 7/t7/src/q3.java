public class q3 {
    private static int total =1;
    public static void main(String[] args) {
        int input = 9;
        int count=1;

        while (input >=count){
            total *=count;
            count +=1;
        }
        System.out.println("factorial val of "+input+" is "+total);

        total =1;

        for(int x=1;x<=input;x++){
            total *=x;
        }
        System.out.println("factorial val of "+input+" is "+total);

        total =1;
        count=1;

        do {
            total*=count;
            count++;
        }while (count!=(input+1));

        System.out.println("factorial val of "+input+" is "+total);
    }
}
