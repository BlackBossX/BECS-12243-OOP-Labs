public class Cal {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int subtract(int a, int b){
        return a-b;
    }
    double subtract(double a, double b){
        return a-b;
    }
    int division(int a, int b){
        return a/b;
    }
    double division(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Cal Cl = new Cal();
        System.out.println("5 + 6 = " + Cl.add(5,6));
        System.out.println("5 + 5.5 = " + Cl.add(5.0,5.5));
        System.out.println("7 - 2 = " + Cl.subtract(7,2));
        System.out.println("5.25 - 0.125 = " + Cl.subtract(5.25,0.125));
        System.out.println("35 / 4 = " + Cl.division(35,4));
        System.out.println("60.5/3.3 = " + Cl.division(60.5,3.3));

    }

}
