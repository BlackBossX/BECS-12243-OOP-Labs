public class Room {
    int roomNumber;
    String roomType;
    double pricePerNight;
    boolean isAvailable;

    Room(int roomNumber, String roomType, double pricePerNight, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;

    }

    void bookRoom(){
        if(isAvailable() ){
            isAvailable = false;
            System.out.println("Room has been booked");
        }else{
            System.out.println("Room is already booked");
        }
    }

    void releaseRoom(){
        if(isAvailable()){
            System.out.println("Room is already Available");
        }else{
            isAvailable = true;
            System.out.println("Room is now Available");
        }
    }

    void displayRoomDetails(){
        System.out.println("Room Number: "+roomNumber+
                           " Room type: "+roomType+
                           " Price per night: "+pricePerNight+
                           " Availability: "+isAvailable
        );
    }

    boolean isAvailable(){
        return isAvailable;
    }

    int getRoomNumber(){
        return roomNumber;
    }

}
