package EA1;

public class Tiere {
    public static void main(String[] args) {
        String animal = "";
        int amountLegs;
        boolean canFly;
        boolean hasFeathers;
        String dangerous;

        try {
            animal = args[0];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bitte ein Tier eingeben.");
            System.exit(1);
        }
        
        if (animal.equals("Spinne")) {
            amountLegs = 8;
            canFly = false;
            hasFeathers = false;
            dangerous = "eventuell";
        }
        else if (animal.equals("Zwergschnepfe")) {
            amountLegs = 2;
            canFly = true;
            hasFeathers = true;
            dangerous = "nein";
        }
        else if (animal.equals("Bergmolch")) {
            amountLegs = 4;
            canFly = false;
            hasFeathers = false;
            dangerous = "nein";
        }
        else if (animal.equals("Königskobra")) {
            amountLegs = 0;
            canFly = false;
            hasFeathers = false;
            dangerous = "ja";
        }
        else if (animal.equals("Tausendfüßer")) {
            amountLegs = 1000; // Stimmt eigentlich nicht ganz...
            canFly = false;
            hasFeathers = false;
            dangerous = "nein";
        }
        else if (animal.equals("Kongopfau")) {
            amountLegs = 2;
            canFly = false;
            hasFeathers = true;
            dangerous = "eventuell";
        }
        else if (animal.equals("Elefantenspitzmaus")) {
            amountLegs = 4;
            canFly = false;
            hasFeathers = true;
            dangerous = "nein";
        }
        else if (animal.equals("Schuhschnabel")) {
            amountLegs = 2;
            canFly = true;
            hasFeathers = true;
            dangerous = "nein";
        }
        else if (animal.equals("Feuerameise")) {
            amountLegs = 6;
            canFly = false;
            hasFeathers = false;
            dangerous = "ja";
        }
        else if (animal.equals("Leuchtqualle")) {
            amountLegs = 0;
            canFly = false;
            hasFeathers = false;
            dangerous = "ja";
        }
        else {
            // Programm bricht ab, wenn das Tier nicht implementiert ist
            System.out.println("Das Tier ist leider nicht in der Datenbank!");
            return;
        }
        // Ausgabe
        System.out.printf("%d Beine\n", amountLegs);
        System.out.printf("flugfähig: %s\n", (canFly ? "ja" : "nein"));
        System.out.printf("hat Federn: %s\n", (hasFeathers ? "ja" : "nein"));
        System.out.printf("gefährlich für Menschen: %s\n", dangerous);
    }
}