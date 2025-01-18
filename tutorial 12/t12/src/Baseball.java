public class Baseball extends Ball {

    Baseball(String brand) {
        super(brand);
    }

    @Override
    public void toss() {
        super.toss();
    }

    @Override
    public void bounce() {
        System.out.println("Baseball Will Bounce");
    }


}
