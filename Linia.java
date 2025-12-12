import java.util.Arrays;

public class Linia {
    private int id;
    private Punt[] punts;

    public Linia(int id, Punt p1, Punt p2) {
        this.id = id;
        this.punts = new Punt[2];
        this.punts[0] = p1;
        this.punts[1] = p2;
    }

    public Linia(int id, Punt[] punts) {
        if (punts.length < 2) {
            System.out.println("Una línea necesita al menos 2 puntos. La línea se creará vacía.");
            this.punts = new Punt[0];
        } else {
            this.punts = punts;
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Linia{" +
                "id=" + id +
                ", punts=" + Arrays.toString(punts) +
                '}';
    }
}