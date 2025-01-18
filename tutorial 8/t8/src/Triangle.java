public class Triangle {
    int a,b,c;
    Triangle(){
        a=3;
        b=4;
        c=5;
    }
    int perimeter() {
        return a + b + c;
    }
    double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        System.out.println("Perimeter : " + T1.perimeter() );
        System.out.println("Area : " + T1.area());
    }
}
