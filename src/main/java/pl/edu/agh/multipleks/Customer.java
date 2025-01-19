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

    }
}
