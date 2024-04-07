package EA3;

enum Planet {
    MERKUR(0, 0.39), 
    VENUS(0, 0.72), 
    ERDE(1, 1.00), 
    MARS(2, 1.52), 
    JUPITER(95, 5.20), 
    SATURN(146, 9.54), 
    URANUS(28, 19.22), 
    NEPTUN(16, 30.06);

    private int amountSatellites;
    private double distanceToSun; // In AU

    private Planet(int amountSatellites, double distanceToSun) {
        this.amountSatellites = amountSatellites;
        this.distanceToSun = distanceToSun;
    }

    public int getNumberOfMoons() {
        return this.amountSatellites;
    }

    public boolean isCloserToSunThan(Planet other) {
        return this.distanceToSun < other.distanceToSun;
    }
}
