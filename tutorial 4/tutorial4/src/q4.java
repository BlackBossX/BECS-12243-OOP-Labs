public class q4 {
    public static void main(String[] args) {

        double Celsius = Double.parseDouble(args[0]);
        double Fahrenheit = (Celsius*(9/5.0))+32;

        System.out.printf("Temperature in Celsius:  %.2f°C\n",Celsius);
        System.out.printf("Converted Temperature in Fahrenheit: %.2f°F\n",Fahrenheit);



    }
}