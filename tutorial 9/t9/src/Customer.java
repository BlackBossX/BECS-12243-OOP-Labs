public class Customer {
    String customerID;
    String name;
    Room bookedRoom;

    Customer(String customerID,String name){
        this.customerID =customerID;
        this.name =name;
        this.bookedRoom = null;
    }

    void bookRoom(Room room){
        if(room.isAvailable()){
            room.bookRoom();
            bookedRoom = room;
            System.out.println(name+" has booked room "+ room.roomNumber);
        }else{
            System.out.println("Room "+room.roomNumber+" is not available");
        }
    }


    void displayBookingDetails(){
        System.out.println("Customer ID: "+customerID+" Customer Name: "+ name);
        if(bookedRoom!=null){
            bookedRoom.displayRoomDetails();
        }else{
            System.out.println("No Room is Booked");
        }
    }
}
