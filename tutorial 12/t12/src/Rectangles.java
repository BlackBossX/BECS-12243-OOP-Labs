public class Rectangles extends Shapes {
    double width;
    double length;

    Rectangles(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public boolean fitsText(String text) {
        return text.length() < length;
    }

    @Override
    public void drawSign() {
        System.out.println("Rectangle is drawn");
    }
}
