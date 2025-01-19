class Bicycle implements IVehicle {
    int mileage;
    int numGears;

    Bicycle(int mileage, int numGears) {
        this.mileage = mileage;
        this.numGears = numGears;
    }

    public void booleanCanCarry(int passengers) {
        System.out.println("can carry " + passengers + "!");
    }

    public double tuneUpCost() {
        return 0;
    }
}


