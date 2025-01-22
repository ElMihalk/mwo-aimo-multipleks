package pl.edu.agh;

import pl.edu.agh.multipleks.SeatLayout;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var x = List.of(10,10,12,14,10,12,13,12);
        SeatLayout layout1 = new SeatLayout(x);
        layout1.printLayout();
    }
}
