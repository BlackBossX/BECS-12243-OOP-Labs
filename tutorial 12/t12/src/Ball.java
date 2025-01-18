public class Ball implements Tossable {
    public String brandName;

    Ball(String brand) {
        this.brandName = brand;
    }

    public void toss() {

    }

    public void bounce() {
        System.out.println("Ball Will Bounce");
    }

    public String getBrandName() {
        return brandName;
    }
}
