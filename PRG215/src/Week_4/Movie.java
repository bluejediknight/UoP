package Week_4;

public class Movie {
    
	private String movieTitle;
    private String movierating;
    private int movieyear;
    private int movierunTime;
    
    public Movie(String title, String rating, int year, int runTime)
    {
        movieTitle = title;
        movierating = rating;
        movieyear = year;
        movierunTime = runTime;
    }
    
    public String toString()
    {
        return "\nMovie title:\t" + movieTitle + "\n Rating:\t" + movierating + 
                "\n Year:   \t" + movieyear + "\n Runtime:\t" + movierunTime;
    }
    
        
}
