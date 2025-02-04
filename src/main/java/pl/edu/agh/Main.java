package pl.edu.agh;

import pl.edu.agh.multipleks.*;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Dane potrzebne do stworzenia układu siedzeń w salach
        var x = List.of(10,10,12,14,10,12,13,12);
        var y = List.of(10,10,11,11,12,12,11);

//        Kino
        Cinema cinema1 = new Cinema("Big Cinema", "City Town, 37 Avenue St");

//        Układy siedzeń w salach
        SeatLayout layout1 = new SeatLayout(x);
        SeatLayout layout2 = new SeatLayout(y);

//        Sale kinowe z przypisanymi układami siedzeń
        ScreeningRoom screeningRoom1 = new ScreeningRoom("1", layout1);
        ScreeningRoom screeningRoom2 = new ScreeningRoom("2", layout2);

//        Sale dodane do kina
        cinema1.addRoom(screeningRoom1);
        cinema1.addRoom(screeningRoom2);

//        Spektakle - zawierają daty i filmy
        Screening screening1 = new Screening(new Date(125, 1, 4), "17:00", new Movie("James Bon"));
        Screening screening2 = new Screening(new Date(125, 1, 5), "12:00", new Movie("Star War"));
        Screening screening3 = new Screening(new Date(125, 1, 6), "15:00", new Movie("James Bon"));

//        Spektakle dodane do sal kinowych
        screeningRoom1.addScreening(screening1);
        screeningRoom2.addScreening(screening2);
        screeningRoom2.addScreening(screening3);

//        Ustawienie parametrów VIP i 3D spektakli
        screening1.set3D();
        screening2.setVIP();

//        Program kina na najbliższy tydzień (wg aktualnej daty)
        cinema1.printProgramme();

//        Zakup biletu przez zalogowanego użytkownika - imię, nazwisko, email
        Ticket tk1 = screening1.buyTicket('A', "1");
        Ticket tk2 = screening1.buyTicket('F', "10");
        Ticket tk3 = screening1.buyTicket('G', "8");
        Customer customer1 = new Customer("J", "T", "random@gmail.com");
        customer1.addTicket(tk1);
        customer1.addTicket(tk2);
        customer1.addTicket(tk3);
        customer1.checkTickets();

//        Klient anonimowy - email potrzebny do wysyłki biletu
        Customer customer2 = new Customer("othermail@gmail.com");
        Ticket tk4 = screening1.buyTicket('H',"3");
        customer2.addTicket(tk4);
        customer2.checkTickets();

//        Układ sali kinowej po zakupie biletów
        screening1.getLayout().printLayout();

//        Wyszukiwanie spektakli po tytule filmu
        cinema1.findMovie("James Bon");
    }

}
