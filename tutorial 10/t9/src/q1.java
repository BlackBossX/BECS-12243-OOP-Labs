public class q1 {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println("objA.a = "+objA.a);
        objA.a = 222;
    }
}
class A {
    public int a = 100;
    public void setA( int value) {
        a = value;
    }
    public int getA() {
        return a;
    }
}
