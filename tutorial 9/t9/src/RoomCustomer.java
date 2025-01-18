public class RoomCustomer {
    public static void main(String[] args) {

        Room room1 = new Room(101,"Single",1500.0,true);
        Room room2 = new Room(102,"Double",2500.0,true);

        Customer c1 = new Customer("C001","Alice");
        Customer c2 = new Customer("C002","Bob");

        c1.bookRoom(room1);
        c1.displayBookingDetails();
        System.out.println(" ");

        c2.displayBookingDetails();
        System.out.println(" ");

        c2.bookRoom(room1);

        c1.bookedRoom.releaseRoom();
        System.out.println(" ");

        c2.bookRoom(room1);
        System.out.println(" ");

        c1.displayBookingDetails();
        System.out.println(" ");

        c2.displayBookingDetails();


/*
        c2.bookRoom(room1);
        room1.releaseRoom();

        c1.displayBookingDetails();
        c2.displayBookingDetails();
*/


    }

}