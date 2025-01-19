class Car implements IVehicle {
    int mileage;
    int year;
    int numDoors;

    Car(int mileage, int year, int numDoors) {
        this.mileage = mileage;
        this.year = year;
        this.numDoors = numDoors;
    }

    public void booleanCanCarry(int passengers) {
        System.out.println("can carry " + passengers + "!");
    }

    public double tuneUpCost() {
        return 100;
    }

    boolean builtBefore(int otherYear) {
        return this.year < otherYear;
    }
}