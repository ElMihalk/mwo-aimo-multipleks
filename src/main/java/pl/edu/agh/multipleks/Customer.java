package pl.edu.agh.multipleks;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String firstname;
    String lastname;
    String emailAddress;
    List<Ticket> tickets = new ArrayList<>();

    public Customer(String firstname, String lastname, String emailAddress){
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAddress = emailAddress;
    }

    public Customer(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void checkTickets(){
        System.out.println("=".repeat(30));
        System.out.println(String.format("%s %s", this.firstname, this.lastname));
        System.out.println(String.format("%s", this.emailAddress));
        for (Ticket ticket : this.tickets){
            ticket.printTicket();
        }
        System.out.println("=".repeat(30));
    }

    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }
}
