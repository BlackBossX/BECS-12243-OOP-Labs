public class Circles extends Shapes {
    double radius;

    Circles(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public boolean fitsText(String text) {
        return text.length() < radius;
    }

    public void drawSign() {
        System.out.println("Circle is drawn");
    }

}
