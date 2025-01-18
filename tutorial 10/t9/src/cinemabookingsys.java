public class cinemabookingsys {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Avatar 2", 180);
        Movie movie2 = new Movie("Interstellar", 165);
        Cinema cinema = new Cinema(3);
        cinema.bookTicket(new Ticket(movie1, "A1", 1200.00));
        cinema.bookTicket(new Ticket(movie2, "B5", 1500.00));

        cinema.displayAllTickets();
    }
}