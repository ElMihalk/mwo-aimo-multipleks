package pl.edu.agh.multipleks;

public class Screening {
    private String date;
    private Movie movie;

    public Screening(String date, Movie movie){
        this.date = date;
        this.movie = movie;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public void printScreening(){
        System.out.println(this.date);
        System.out.println(this.movie.title);
    }

}
