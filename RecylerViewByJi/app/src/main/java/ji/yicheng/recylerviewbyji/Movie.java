package ji.yicheng.recylerviewbyji;

/**
 * Created by Ji on 16/3/14.
 */
public class Movie {

    //declare title, genre and year
    private String title, genre, year;

    public Movie() {
    }

    //add the getter/setter methods to each variable.
    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
