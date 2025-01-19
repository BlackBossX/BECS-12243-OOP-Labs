public class testShapeClient {
    public static void main(String[] args) {
        Circles circle1 = new Circles(7, "red");
        Circles circle2 = new Circles(12, "blue");

        Rectangles rectangle1 = new Rectangles(12, 28, "green");

        if (circle1.fitsText("Be silent")) {
            System.out.println("Circle1 is Big Enough");
            circle1.drawSign();
        } else
            System.out.println("Circle1 is Not Big Enough");

        if (circle2.fitsText("Study Rooms")) {
            System.out.println("Circle2 is Big Enough");
            circle2.drawSign();
        } else
            System.out.println("Circle2 is Not Big Enough");

        if (rectangle1.fitsText("Just 3 min walk for a snack")) {
            System.out.println("Rectangle1 is Big Enough");
            rectangle1.drawSign();
        } else
            System.out.println("Rectangle1 is Not Big Enough");

    }
}
