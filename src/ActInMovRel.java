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
}
