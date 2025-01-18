public class Ticket {
    Movie movie;
    String seatNumber;
    double price;

    Ticket(Movie movie,String seatNumber ,double price){
        this.movie = movie;
        this.seatNumber = seatNumber;
        this.price =price;
    }

    public void displayTicket(){
        movie.displayMovieDetails();
        System.out.println("Seat no: "+seatNumber+" ,Price: "+price);
    }

}
