package pl.edu.agh.multipleks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeatLayout {
    private Map<Character, List<Integer>> layout = new HashMap<>();

    public SeatLayout(List<Integer> seatPerRow){
        if (seatPerRow.size()>26){
            System.out.println("Number of seat rows larger than expected. Only A-Z rows are allowed.");
            seatPerRow = seatPerRow.subList(0,25);
        }

        Map<Character,List<Integer>> layout = new HashMap<>();
        char rowMarker = 'A';
        for (Integer nOfSeats : seatPerRow){
            rowMarker++;
            List<Integer> seatNumbers = IntStream
                    .rangeClosed(1,nOfSeats)
                    .boxed()
                    .collect(Collectors.toList());
            layout.put(rowMarker,seatNumbers);
        }
        this.layout = layout;
    }

    public void printLayout(){
        for (Map.Entry<Character, List<Integer>> e : this.layout.entrySet()){
            System.out.print(String.format("%c: ", e.getKey()));
            for (Integer seat : e.getValue()){
                System.out.print(String.format("[%d]", seat));
            }
            System.out.println();
        }
    }
}
