import java.util.ArrayList;

public class Area {
    private int id;
    private Punt p1;
    private Punt p2;
    private Punt p3;
    private ArrayList<Punt> punts;

    public Area(int id, Punt p1, Punt p2, Punt p3) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.punts = punts;
    }

    public Area(ArrayList<Punt> punts){
        this.punts = punts;
    }

    @Override
    public String toString() {
        return "Area{" + '\n' +
                "id=" + id + '\n' +
                ", p1=" + p1 + '\n' +
                ", p2=" + p2 + '\n' +
                ", p3=" + p3;
    }
}
