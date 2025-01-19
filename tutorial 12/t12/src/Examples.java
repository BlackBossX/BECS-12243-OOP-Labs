public class Examples {

    public static void main(String[] args) {
        IVehicle newKidsBike = new Bicycle(0, 1);

        IVehicle oldCar2 = new Car(200000, 1995, 2);
        oldCar2.booleanCanCarry(4);
        oldCar2.tuneUpCost();

        Car oldCar = new Car(200000, 1995, 2);
        oldCar.booleanCanCarry(4);
        oldCar.tuneUpCost();
        oldCar.booleanCanCarry(2005);

    }
}
