package pl.edu.agh;

import pl.edu.agh.multipleks.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var x = List.of(10,10,12,14,10,12,13,12);
        SeatLayout layout1 = new SeatLayout(x);
        layout1.printLayout();
        System.out.println();
        ScreeningRoom sroom = new ScreeningRoom("12", layout1);
        Screening screening = new Screening("22.01", new Movie("James Bon"));
        sroom.addScreening(screening);
        Ticket tk1 = screening.buyTicket('A', "1");
        Ticket tk2 = screening.buyTicket('F', "10");
        Ticket tk3 = screening.buyTicket('G', "8");
        Customer customer1 = new Customer("J", "T", "random@gmail.com");
        customer1.addTicket(tk1);
        customer1.addTicket(tk2);
        customer1.addTicket(tk3);
        customer1.checkTickets();

        screening.getLayout().printLayout();
    }
}
