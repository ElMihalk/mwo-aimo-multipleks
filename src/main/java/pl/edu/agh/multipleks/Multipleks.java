package pl.edu.agh.multipleks;

import java.util.ArrayList;
import java.util.List;

public class Multipleks {
    private List<Cinema> cinemas = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addCinema(Cinema cinema){
        this.cinemas.add(cinema);
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }


}
