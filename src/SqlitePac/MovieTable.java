package SqlitePac;

public class MovieTable {
    private int id;
    private String tittle;
    private int len;
    private int year;
    private long cost;
    private String genre;

    public MovieTable(int id, String tittle, int len, int year, long cost, String genre) {
        this.id = id;
        this.tittle = tittle;
        this.len = len;
        this.year = year;
        this.cost = cost;
        this.genre = genre;
    }

    public MovieTable() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "["+id+"]"+
                "["+tittle+"]"+
                "["+len+"]"+
                "["+year+"]"+
                "["+cost+"]"+
                "["+genre+"]";
    }
}