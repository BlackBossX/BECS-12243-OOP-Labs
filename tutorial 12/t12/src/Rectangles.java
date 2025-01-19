public class Rectangles implements Signs {
    double width;
    double length;
    String color;

    Rectangles(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public void printSign() {

    }

    public void printArea() {

    }

    public boolean fitsText(String text) {
        return text.length() < length;
    }

    @Override
    public void drawSign() {
        System.out.println("Rectangle is drawn");
    }
}
