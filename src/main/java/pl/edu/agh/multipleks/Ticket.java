package pl.edu.agh.multipleks;

public class Ticket {
    String seat;
    Screening screening;

    public Ticket(String seat, Screening screening) {
        this.seat = seat;
        this.screening = screening;
    }

    public void printTicket(){
        System.out.println("=".repeat(10));
        System.out.println(String.format("Title: %s", this.screening.getMovie().title));
        System.out.println(String.format("Date: %s", this.screening.getDate()));
        System.out.println(String.format("Seat: %s", this.seat));
        System.out.println("=".repeat(10));
    }


}
