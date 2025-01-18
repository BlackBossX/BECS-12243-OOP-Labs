public class partc {
    public static void main(String[] args) {
        A2 objA = new A2( );
        int result = 55;
        objA.setA(result);
        System.out.println("objA.a = "+ objA.getA());
    }
}
class A2 {
    private int a = 100;
    public void setA( int value) {
        a = value;
    }
    public int getA() {
        return a;
    }
}
