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
        this.screening.printDate();
        System.out.println(this.screening.getTime());
        System.out.println(String.format("Seat: %s", this.seat));
        String threeD = "No";
        if (screening.get3D()){
            threeD = "Yes";
        }
        System.out.println(String.format("3D: %s", threeD));
        String vip = "No";
        if (screening.getVIP()){
            vip = "Yes";
        }
        System.out.println(String.format("VIP: %s", vip));
        System.out.println("=".repeat(10));
    }


}
