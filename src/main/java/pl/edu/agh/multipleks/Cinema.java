package pl.edu.agh.multipleks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List<ScreeningRoom> screeningRooms = new ArrayList<>();

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void printProgramme(){
        List<Screening> printScreenings = new ArrayList<>();
        System.out.println("=".repeat(30));
        System.out.println(String.format("%s programme", this.name));
        for (ScreeningRoom room : this.screeningRooms){
            for (Screening screening : room.getScreenings()){
                Calendar cal = Calendar.getInstance();
                cal.setTime(new Date());
                cal.add(Calendar.DATE, 7);
                Date weekAhead = cal.getTime();
                if (screening.getDate().after(new Date()) && screening.getDate().before(weekAhead)){
                    System.out.println("=".repeat(10));
                    screening.printScreening();
                    System.out.println("=".repeat(10));
                }
            }
        }
        System.out.println("=".repeat(30));
    }

    public void findMovie(String title){
        List<Screening> validScreenings = new ArrayList<>();
        System.out.println(String.format("\nSearch results for \"%s\":", title));
        for (ScreeningRoom room : this.screeningRooms){
            for (Screening screening : room.getScreenings()){
                if (screening.getMovie().getTitle().equals(title)){
                    System.out.println("=".repeat(20));
                    validScreenings.add(screening);
                    screening.printScreening();
                    System.out.println("=".repeat(20));
                }
            }
        }
        if (validScreenings.isEmpty()){
            System.out.println("No movies found!");
        }
    }

    public void addRoom(ScreeningRoom room){
        screeningRooms.add(room);
    }


}
