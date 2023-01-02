import java.io.Serializable;
import java.util.Date;

public class Album  implements Serializable {


    private int id;
    private String artistName;
    private String recordName;
    private int releaseDate;
    private String genre;
    private double sales;

    public Album() {
    }

    public Album(int id, String artistName, String recordName, int releaseDate, String genre, double sales) {
        this.id = id;
        this.artistName = artistName;
        this.recordName = recordName;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.sales = sales;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getArtistName() {
        return artistName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }


    public String getRecordName() {
        return recordName;
    }
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }


    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    public double getSales() {
        return sales;
    }
    public void setSales(double sales) {
        this.sales = sales;
    }
}

