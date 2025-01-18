public class testDriver {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Cylinder();
        Cylinder c3 = new Cylinder (3.1);
        Circle c4 = new Circle(2.3);
        Circle c5 = new Cylinder (2.4, 4.0);
        Cylinder c6 = new Cylinder (3.1, 5.2, "red");
        Circle c7 = new Circle(2.1, "yellow");

        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getColor());
        System.out.println("------------");

        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.getColor());
        System.out.println("------------");

        System.out.println(c3.getRadius());
        System.out.println(c3.getArea());
        System.out.println(c3.getColor());
        System.out.println(c3.getHeight());
        System.out.println("------------");

        System.out.println(c4.getRadius());
        System.out.println(c4.getArea());
        System.out.println(c4.getColor());
        System.out.println("------------");

        System.out.println(c5.getRadius());
        System.out.println("------------");

        System.out.println(c6.getHeight());
        System.out.println(c6.getRadius());
        System.out.println(c6.getColor());
        System.out.println("------------");

    }
}
