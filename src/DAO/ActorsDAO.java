package DAO;

import SqlitePac.ActorTable;
import SqlitePac.Actors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ActorsDAO {
    String url = "jdbc:sqlite:C:\\Users\\iitc\\Desktop\\Sql\\Movies.db";
    SqliteConnection sqliteConnection = new SqliteConnection();
    Connection connection = sqliteConnection.getConnection(url);
    Statement stm = sqliteConnection.getStatement();
    Actors actors=new Actors();

    public Actors getActors(){
        try {
            ResultSet result = stm.executeQuery("SELECT * FROM Actors");
            System.out.println("all good");

            while (result.next()){
                ActorTable actorTable=new ActorTable();
                actorTable.setId(result.getInt("id"));
                actorTable.setName(result.getString("name"));
                actorTable.setBirthDate(result.getString("birthDate"));
                actorTable.setFirstMovie(result.getString("firstMovie"));
                actorTable.setCityOfBirth(result.getString("cityOfBirth"));
                actorTable.setIsMarried(result.getString("isMarried"));
                actors.addToSet(actorTable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return actors;
    }
}
