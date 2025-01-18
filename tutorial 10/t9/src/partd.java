public class partd {
    public static void main(String[] args) {
        A3 objA = new A3( );
        System.out.println("objA.a = "+ objA.getA());
        objA.setA(55);
        System.out.println("objA.a = "+ objA.getA());
    }
}
class A3 {
    int a = 100;
    public void setA( int value) {
        a = value;
    }
    public int getA() {
        return a;
    }
}
