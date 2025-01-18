public class partb {
    public static void main(String[] args) {
        System.out.println("objA.a = "+A1.getA() );
        A1.setA(123);
        System.out.println("objA.a = "+A1.getA() );
    }
}
class A1 {
    private  static int a = 100;
    public  static void setA( int value) {
        a = value;
    }
    public  static int getA() {
        return a;
    }
}