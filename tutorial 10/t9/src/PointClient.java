public class PointClient {

    public static void main(String[] args) {
        Point obj1 = new Point(20,2);
        Point obj2 = new Point(3,6);

        String second = obj1.distance(3,6);
        String first = obj2.distance();
        System.out.println(first);
        System.out.printf(second);
    }



}
