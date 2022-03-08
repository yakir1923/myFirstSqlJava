package SqlitePac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

public class ActInMovRel {
    private HashSet<RelId> rell=new HashSet();

    public ActInMovRel() {
    }

    public ActInMovRel(HashSet<RelId> rell) {
        this.rell = rell;
    }

    public HashSet<RelId> getRell() {
        return rell;
    }

    public void setRell(HashSet<RelId> rell) {
        this.rell = rell;
    }
    public void addToSet(RelId r){
        this.rell.add(r);
    }

    public static void addActInMovRel(ActInMovRel actInMovRel, Connection connection) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\iitc\\Desktop\\Sql\\Movies.db");
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