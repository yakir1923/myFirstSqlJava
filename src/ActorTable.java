public class ActorTable {
    private int id;
    private String name;
    private String birthDate;
    private String firstMovie;
    private String cityOfBirth;
    private String isMerried;

    public ActorTable() {
    }

    public ActorTable(int id, String name, String birthDate, String firstMovie, String cityOfBirth, String isMerried) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.firstMovie = firstMovie;
        this.cityOfBirth = cityOfBirth;
        this.isMerried = isMerried;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstMovie() {
        return firstMovie;
    }

    public void setFirstMovie(String firstMovie) {
        this.firstMovie = firstMovie;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getIsMerried() {
        return isMerried;
    }

    public void setIsMerried(String isMerried) {
        this.isMerried = isMerried;
    }

    @Override
    public String toString() {
        return "["+id+"]"+
                "["+name+"]"+
                "["+birthDate+"]"+
                "["+firstMovie+"]"+
                "["+cityOfBirth+"]"+
                "["+isMerried+"]";
    }
}
