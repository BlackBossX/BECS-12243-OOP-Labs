public class Football extends Ball {

    Football(String brand) {
        super(brand);
    }

    @Override
    public void toss() {
        super.toss();
    }

    @Override
    public void bounce() {
        System.out.println("Football Will Bounce");
    }
}
