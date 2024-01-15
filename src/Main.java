public class Main {
    public static void main(String[] args) {
        Punt p1 = new Punt(1, 6, 4);
        Punt p2 = new Punt(2,4,7);
        Punt p3 = new Punt(3,8,2);
        Linea l1 = new Linea(1, p1, p2);
        Area a1 = new Area(1, p1, p2, p3);

        System.out.println(p1.toString());
        System.out.println(" ");
        System.out.println(p2.toString());
        System.out.println(" ");
        System.out.println(p3.toString());
        System.out.println(" ");
        System.out.println(l1.toString());
        System.out.println(" ");
        System.out.println(a1.toString());
    }
}
