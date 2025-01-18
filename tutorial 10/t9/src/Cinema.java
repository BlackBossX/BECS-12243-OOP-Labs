public class Cinema {
    Ticket[] tickets;
    int ticketCount;

    Cinema(int capacity) {
        this.ticketCount = 0;
        tickets = new Ticket[capacity];
    }

    public void bookTicket(Ticket ticket) {
        if (ticketCount < tickets.length) {
            tickets[ticketCount] = ticket;
            ticketCount++;
        } else {
            System.out.println("No more tickets available");
        }
    }

    public void displayAllTickets() {
        System.out.println("All Booked Tickets:");
        for (int i = 0; i < ticketCount; i++) {
            tickets[i].displayTicket(); // Display each ticket
        }
    }
}
