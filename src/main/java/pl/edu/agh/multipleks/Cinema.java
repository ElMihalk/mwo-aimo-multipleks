package pl.edu.agh.multipleks;

import java.util.ArrayList;
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
        for (ScreeningRoom room : this.screeningRooms){
            for (Screening screening : room.getScreenings()){
                System.out.println("=".repeat(10));
                screening.printScreening();
                System.out.println("=".repeat(10));
            }
        }
    }

    public List<Screening> findMovie(String title){
        List<Screening> validScreenings = new ArrayList<>();
        for (ScreeningRoom room : this.screeningRooms){
            for (Screening screening : room.getScreenings()){
                if (screening.getMovie().getTitle().equals(title)){
                    validScreenings.add(screening);
                }
            }
        }
        if (validScreenings.isEmpty()){
            System.out.println("No movies found!");
        }
        return validScreenings;
    }

    public void addRoom(ScreeningRoom room){
        screeningRooms.add(room);
    }


}
