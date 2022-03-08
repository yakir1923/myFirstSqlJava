package SqlitePac;

import java.util.HashSet;

public class Actors {
    private HashSet<ActorTable> actors;

    public Actors() {
        actors=new HashSet<>();
    }

    public HashSet<ActorTable> getActors() {
        return actors;
    }

    public void setActors(HashSet<ActorTable> actors) {
        this.actors = actors;
    }

    public void addToSet(ActorTable a){
        actors.add(a);
    }
}