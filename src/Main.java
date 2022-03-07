import jdk.jfr.consumer.RecordedClassLoader;

import java.sql.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Connection connection=null;
        Movies movies=new Movies();
        Actors actors=new Actors();
        ActInMovRel actInMovRel=new ActInMovRel();
        addMovies(movies,connection);
        addActors(actors,connection);
        addActInMovRel(actInMovRel,connection);
        for (RelId m:actInMovRel.getRell())
            System.out.println(m);


    }



    public static void addMovies(Movies movies,Connection connection){
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Desktop\\blutech\\sql\\Movies.db");
            System.out.println("DONE!!!");
            Statement stm=connection.createStatement();
            ResultSet result=stm.executeQuery("SELECT * FROM Movies");
            System.out.println("all good");

            while (result.next()){
                MovieTable movieTable=new MovieTable();
                movieTable.setId(result.getInt("id"));
                movieTable.setTittle(result.getString("title"));
                movieTable.setLen(result.getInt("len"));
                movieTable.setYear(result.getInt("year"));
                movieTable.setCost(result.getLong("cost"));
                movieTable.setGenre(result.getString("genre"));
                //System.out.println(movieTable);
                movies.addToSet(movieTable);
            }
            result.close();
            stm.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void addActors(Actors actors,Connection connection){
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Desktop\\blutech\\sql\\Movies.db");
            System.out.println("DONE!!!");
            Statement stm=connection.createStatement();
            ResultSet result=stm.executeQuery("SELECT * FROM Actors");
            System.out.println("all good");

            while (result.next()){
                ActorTable actorTable=new ActorTable();
                actorTable.setId(result.getInt("id"));
                actorTable.setName(result.getString("name"));
                actorTable.setBirthDate(result.getString("birthDate"));
                actorTable.setFirstMovie(result.getString("firstMovie"));
                actorTable.setCityOfBirth(result.getString("cityOfBirth"));
                actorTable.setIsMerried(result.getString("isMarried"));
                actors.addToSet(actorTable);
            }
            result.close();
            stm.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void addActInMovRel(ActInMovRel actInMovRel,Connection connection) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Desktop\\blutech\\sql\\Movies.db");
            System.out.println("DONE!!!");
            Statement stm = connection.createStatement();
            ResultSet result = stm.executeQuery("SELECT * FROM actinMovRel");
            System.out.println("all good");

            while (result.next()) {
                RelId relId = new RelId();
                relId.setActorId(result.getInt("actorId"));
                relId.setMovieId(result.getInt("movieId"));
                actInMovRel.addToSet(relId);
            }
            result.close();
            stm.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
