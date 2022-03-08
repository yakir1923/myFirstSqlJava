package DAO;

import SqlitePac.MovieTable;
import SqlitePac.Movies;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;

public class MoviesDAO {
    String url = "jdbc:sqlite:C:\\Users\\iitc\\Desktop\\Sql\\Movies.db";
    SqliteConnection sqliteConnection = new SqliteConnection();
    Connection connection = sqliteConnection.getConnection(url);
    Statement stm = sqliteConnection.getStatement();
    Movies movies = new Movies();

    public Movies getAllMovies() {
        try {
            ResultSet result = stm.executeQuery("SELECT * FROM Movies");
            System.out.println("all good");

            while (result.next()) {
                MovieTable movieTable = new MovieTable();
                movieTable.setId(result.getInt("id"));
                movieTable.setTittle(result.getString("title"));
                movieTable.setLen(result.getInt("len"));
                movieTable.setYear(result.getInt("year"));
                movieTable.setCost(result.getLong("cost"));
                movieTable.setGenre(result.getString("genre"));
                //System.out.println(movieTable);
                movies.addToSet(movieTable);
            }
//            result.close();
//            stm.close();
//            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }


    public MovieTable getMoviesById(int id) {
        MovieTable movieTable = new MovieTable();
        try {
            ResultSet result = stm.executeQuery("SELECT * FROM Movies WHERE id=" + id);
            result.next();
            movieTable.setId(result.getInt("id"));
            movieTable.setTittle(result.getString("title"));
            movieTable.setLen(result.getInt("len"));
            movieTable.setYear(result.getInt("year"));
            movieTable.setCost(result.getLong("cost"));
            movieTable.setGenre(result.getString("genre"));
            //System.out.println(movieTable);
//            result.close();
//            stm.close();
//            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movieTable;
    }

    public boolean removeMovie(int id){
        int x=0;
        try {
         x= stm.executeUpdate("DELETE FROM Movies WHERE id="+id);
            System.out.println(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x != 0;
    }

    public int addMovie( MovieTable m){
        int result=0;
        try {
            result=stm.executeUpdate("INSERT INTO MOVIES(title,len,year,cost,genre)"+
                                          "VALUES('"+m.getTittle()+"',"
                    +m.getLen()+","
                    +m.getYear()+","
                    +m.getCost()+",'"
                    +m.getGenre()+"')"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean updateMovie(MovieTable m,int id){
        try {
            stm.executeUpdate("UPDATE Movies SET title='"+m.getTittle()+"',cost="+m.getCost()+",year="+m.getYear()+",len="+m.getLen()+",genre='"+m.getGenre()+"' WHERE id="+id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}

