package pl.edu.agh.multipleks;

public class Screening {
    String date;
    Movie movie;

    public Screening(String date, Movie movie){
        this.date = date;
        this.movie = movie;
    }

    public String getMovie(){
        System.out.println(String.format("%s: "));
    }
}
