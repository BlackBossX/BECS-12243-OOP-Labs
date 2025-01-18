public class q6 {
    public static void main(String[] args) {
        double tempDay1 = 23.5, tempDay2 = 25.3, tempDay3 = 22.8;
        double averageTemp = 0;
        double day1 = tempDay1;
        double day2 = tempDay2;
        averageTemp = (day1 + day2 + (double)tempDay3) / 3;
        System.out.println("The average temperature is: " + averageTemp);
    }
}