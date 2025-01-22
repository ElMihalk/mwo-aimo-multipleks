package pl.edu.agh.multipleks;

import java.util.ArrayList;
import java.util.List;

public class ScreeningRoom {
    private String designation;
    private List<Screening> screenings = new ArrayList<>();
    private SeatLayout layout;

    public ScreeningRoom(String designation, SeatLayout layout) {
        this.designation = designation;
        this.layout = layout;
    }

    public List<Screening> getScreenings(){
        return screenings;
    }

    public void addScreening(Screening screening){
        screening.addLayout(this.layout);
        this.screenings.add(screening);
    }

}
