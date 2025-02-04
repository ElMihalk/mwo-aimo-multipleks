package pl.edu.agh.multipleks;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Screening {
    private Date date;
    private String time;
    private Movie movie;
    private SeatLayout screeningLayout;
    private boolean isVIP = false;
    private boolean is3D = false;

    public Screening(Date date, String time, Movie movie){
        this.date = date;
        this.time = time;
        this.movie = movie;
    }

    public void setVIP(){
        this.isVIP = !this.isVIP;
    }

    public void set3D(){
        this.is3D = !this.is3D;
    }

    public boolean get3D(){
        return this.is3D;
    }

    public boolean getVIP(){
        return this.isVIP;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public Date getDate(){ return this.date; }

    public String getTime(){
        return this.time;
    }

    public void printDate(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM");
        System.out.println(format.format(this.date));
    }

    public void printScreening(){
        printDate();
        System.out.println(this.time);
        System.out.println(this.movie.title);
        if(this.is3D){
            System.out.println("3D");
        }
        if (this.isVIP){
            System.out.println("VIP");
        }
    }

    public void addLayout(SeatLayout layout){
        this.screeningLayout = new SeatLayout(layout);
    }

    public SeatLayout getLayout(){
        return this.screeningLayout;
    }

    public Ticket buyTicket(char row, String seat){
        if (this.screeningLayout.getLayout().get(row).get(Integer.valueOf(seat)-1).equals("X")){
            System.out.println("Seat already reserved!");
            return null;
        }
        this.screeningLayout.getLayout().get(row).set(Integer.valueOf(seat)-1, "X");
        return new Ticket(String.format("%s%s", row, seat), this);
    }

}
