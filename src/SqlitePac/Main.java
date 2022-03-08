package SqlitePac;

import DAO.ActorsDAO;
import DAO.MoviesDAO;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection connection=null;
        ActInMovRel actInMovRel=new ActInMovRel();
        MoviesDAO moviesDAO=new MoviesDAO();
        ActorsDAO actorsDAO=new ActorsDAO();
        MovieTable movieTable=new MovieTable();
        Movies movies= moviesDAO.getAllMovies();
        Actors actors = actorsDAO.getActors();
        ActInMovRel.addActInMovRel(actInMovRel,connection);
        Scanner scanner=new Scanner(System.in);
        System.out.println("give me title");
        movieTable.setTittle(scanner.next());
        System.out.println("give me len");
        movieTable.setLen(scanner.nextInt());
        System.out.println("give me year");
        movieTable.setYear(scanner.nextInt());
        System.out.println("give me cost");
        movieTable.setCost(scanner.nextLong());
        System.out.println("give me genre");
        movieTable.setGenre(scanner.next());
        boolean x=moviesDAO.updateMovie(movieTable,13);
        System.out.println(x);

    }
}