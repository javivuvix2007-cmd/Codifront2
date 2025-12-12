public class Main {
    public static void main(String[] args) {
        Punt a = new Punt(1, 0, 0);
        Punt b = new Punt(2, 5, 0);
        Punt c = new Punt(3, 5, 5);
        Punt d = new Punt(4, 0, 5);
        Linia l1 = new Linia(1, a, b);

        Punt[] puntsLinia = new Punt[3];
        puntsLinia[0] = a;
        puntsLinia[1] = b;
        puntsLinia[2] = c;
        Linia l2 = new Linia(2, puntsLinia);
        Area area1 = new Area(1, a, b, c);

        Punt[] puntsArea = new Punt[4];
        puntsArea[0] = a;
        puntsArea[1] = b;
        puntsArea[2] = c;
        puntsArea[3] = d;
        Area area2 = new Area(2, puntsArea);

        System.out.println(a);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(area1);
        System.out.println(area2);
    }
}