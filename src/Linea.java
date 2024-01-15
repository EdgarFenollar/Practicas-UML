public class Linea {
    private int id;
    private Punt p1;
    private Punt p2;

    public Linea(int id, Punt p1, Punt p2) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "id=" + id +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
