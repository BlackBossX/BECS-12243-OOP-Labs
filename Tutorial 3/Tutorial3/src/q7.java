public class q7 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 4;
        int num3 = 30;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1 < num2 || num1 > num3);
        System.out.println(num1 > num2 && num1 < num3);
        int max = (num1 > num3) ? num1 : num3;
        System.out.println("Max is: " + max);
        int y = 5;
        boolean isTrue = false;
        System.out.println(y++);
        System.out.println(++y);
        System.out.println(y--);
        System.out.println(--y);
        System.out.println(!isTrue);
    }
}
