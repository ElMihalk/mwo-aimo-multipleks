package pl.edu.agh.multipleks;

import java.util.ArrayList;
import java.util.List;

public class ScreeningRoom {
    private String designation;
    private List<Screening> screenings = new ArrayList<>();

    public ScreeningRoom(String designation) {
        this.designation = designation;
    }

    public void findMovie(String title){

    }

    public List<Screening> getScreenings(){
        return screenings;
    }

}
