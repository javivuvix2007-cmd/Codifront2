import java.util.Arrays;
public class Area {
    private int id;
    private Punt[] punts;

    public Area(int id, Punt p1, Punt p2, Punt p3) {
        this.id = id;
        this.punts = new Punt[3];
        this.punts[0] = p1;
        this.punts[1] = p2;
        this.punts[2] = p3;
    }

    public Area(int id, Punt[] punts) {
        if (punts.length < 3) {
            System.out.println("El area necesita 3 puntos minimo");
            this.punts = new Punt[0];
        } else {
            this.punts = punts;
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", punts=" + Arrays.toString(punts) +
                '}';
    }
}