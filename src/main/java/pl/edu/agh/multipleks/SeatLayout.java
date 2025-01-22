package pl.edu.agh.multipleks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeatLayout {
    private Map<Character, List<String>> layout = new HashMap<>();
    private int maxSeats;

    public SeatLayout(List<Integer> seatPerRow){
        if (seatPerRow.size()>26){
            System.out.println("Number of seat rows larger than expected. Only A-Z rows are allowed.");
            seatPerRow = seatPerRow.subList(0,25);
        }
        this.maxSeats = Collections.max(seatPerRow);
        Map<Character,List<String>> layout = new HashMap<>();
        char rowMarker = 'A';
        for (Integer nOfSeats : seatPerRow){
            rowMarker++;
            List<String> seatNumbers = IntStream
                    .rangeClosed(1,nOfSeats)
                    .boxed()
                    .map(Objects::toString)
                    .collect(Collectors.toList());
            layout.put(rowMarker,seatNumbers);
        }
        this.layout = layout;
    }

    public SeatLayout(SeatLayout another){
        this.layout = another.layout;
    }

    public void printLayout(){
        for (Map.Entry<Character, List<String>> e : this.layout.entrySet()){
            System.out.print(String.format("%c: ", e.getKey()));
            System.out.print(" ".repeat(3*(this.maxSeats - e.getValue().size())/2));
            for (String seat : e.getValue()){
                System.out.print(String.format("[%s]", seat));
            }
            System.out.println();
        }
    }
}
