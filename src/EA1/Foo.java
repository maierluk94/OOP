package EA1;

public class Foo {
    public static void main(String[] args) {
        // Eingabe: eine gerade Anzahl von Zahlen
        // Bei einer ungeraden Anzahl kommt es zu einer ArrayIndexOutOfBoundsException
        for (int i = 0; i < args.length; i = i + 2) {
            // Die Schleife geht in Zweierschritten durch die Eingabe
            // x und y werden jeweils die nächsten beiden Zahlen zugewiesen
            try {
                int x = Integer.parseInt(args[i]);
                int y = Integer.parseInt(args[i + 1]);
                // Berechnet den Betrag von x und y
                x = x < 0 ? x * -1 : x;
                y = y < 0 ? y * -1 : y;
                // Berechnet (x + y) mod 3 und speichert das Ergebnis in ergebnis
                int ergebnis = x + y;
                while (ergebnis >= 3) {
                    ergebnis = ergebnis - 3;
                }
                int paarNr = i / 2 + 1;
                // Gibt aus bei welchem Zahlenpaar was das Ergebnis der mod Rechnung war
                switch (ergebnis) {
                case 0:
                    System.out.println(paarNr + ". Paar: 0");
                    break;
                case 1:
                    System.out.println(paarNr + ". Paar: 1");
                    break;
                case 2:
                    System.out.println(paarNr + ". Paar: 2");
                    break;
                default:
                    System.out.println("Das kann nicht sein!");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Mindestens ein Argument ist kein int. Error: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bitte eine gerade Anzahl Zahlen eingeben. Error: " + e.getMessage());
            }
        }
    }
}