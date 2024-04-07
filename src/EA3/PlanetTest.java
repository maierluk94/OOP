package EA3;

public class PlanetTest {
    public static void main(String[] args) {
        Planet p1 = Planet.MARS;
        Planet p2 = Planet.JUPITER;
        System.out.println("Anzahl Monde " + p1 + ": " + p1.getNumberOfMoons());
        System.out.println("Anzahl Monde " + p2 + ": " + p2.getNumberOfMoons());
        if (p1 != p2) {
            if (p1.isCloserToSunThan(p2)) {
                System.out.println(p1 + " ist näher an der Sonne als " + p2);
            } else {
                System.out.println(p2 + " ist näher an der Sonne als " + p1);
            }
        }
    }
}