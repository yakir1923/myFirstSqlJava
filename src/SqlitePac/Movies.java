package SqlitePac;

import DAO.SqliteConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

public class Movies {
    private HashSet<MovieTable> moviesSet;

    public Movies() {
        moviesSet=new HashSet<>();
    }

    public  Movies(HashSet<MovieTable> moviesSet) {
        this.moviesSet = moviesSet;
    }

    public HashSet<MovieTable> getMoviesSet() {
        return moviesSet;
    }

    public void setMoviesSet(HashSet<MovieTable> moviesSet) {
        this.moviesSet = moviesSet;
    }
    public void addToSet(MovieTable movie){
        this.moviesSet.add(movie);
    }
}