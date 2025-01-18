public class Tri {
    int a,b,c;
    Tri(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int perimeter() {
        return a + b + c;
    }
    double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Tri T1 = new Tri(3,4,5);
        System.out.println("Perimeter : " + T1.perimeter() );
        System.out.println("Area : " + T1.area());
    }
}
