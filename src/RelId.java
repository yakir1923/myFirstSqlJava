public class RelId {
    private int actorId;
    private int movieId;

    public RelId(int actorId, int movieId) {
        this.actorId = actorId;
        this.movieId = movieId;
    }

    public RelId() {
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "["+this.movieId+"]"+
                "["+this.actorId+"]";
    }
}
