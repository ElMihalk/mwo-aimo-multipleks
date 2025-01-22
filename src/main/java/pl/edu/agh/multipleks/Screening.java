package pl.edu.agh.multipleks;

public class Screening {
    private String date;
    private Movie movie;
    private SeatLayout screeningLayout;

    public Screening(String date, Movie movie){
        this.date = date;
        this.movie = movie;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public String getDate(){ return this.date; }

    public void printScreening(){
        System.out.println(this.date);
        System.out.println(this.movie.title);
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
