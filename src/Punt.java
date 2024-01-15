public class Punt {
    private int id;
    private double x;
    private double y;

    public Punt (int id, double x, double y){
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punt " + '\n' +
                " id: " + id + '\n' +
                " x: " + x + '\n' +
                " y:" + y ;
    }
}
