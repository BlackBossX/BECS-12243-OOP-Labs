public class Circles implements Signs {
    String color;
    double radius;

    Circles(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void printSign() {

    }

    public void printArea() {

    }

    public boolean fitsText(String text) {
        return text.length() < radius;
    }

    public void drawSign() {
        System.out.println("Circle is drawn");
    }

}
