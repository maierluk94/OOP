package EA1;

public class ExceptionTest {
    public static void main(String[] args) {
      int zahl = 13;
      try {
        try {
          int[] b = { 3, 11, 4, 9 };
          for (int i = 0; i <= b.length; i++) {
            if (b[i] % 3 == 0) {
              zahl = zahl - 1;
            }
          }
          System.out.println("Eine");
          zahl = zahl - 4;
        } catch (ArithmeticException e) {
          // Würde z.B. bei einer Division durch 0 aufgerufen, was hier nicht passiert
          zahl = zahl + (true & false ? 3 : 2); // Sehr dubioser Code
          System.out.println("Ausnahme");
        } catch (Exception e) {
          // Wird aufgerufen, weil eine ArrayIndexOutOfBoundsException auftritt, wenn versucht wird b[4] auszuwerten 
          zahl = zahl + (zahl == 14 ? 3 : 2); // zahl wird 13 (11 + 2)
          System.out.println("Ausnahmen");
        } finally {
          // Wird auf jeden Fall ausgeführt
          zahl = zahl + 4 / 7; // zahl bleibt 13 (13 + 0)
          System.out.println("sind");
        }
        switch (zahl) {
          case 5:
            System.out.println("eine");
            break;
          case 7:
            System.out.println("nicht");
            break;
          case 14:
            System.out.println("macht");
            break;
          case 13:
            // Also wird dieser case ausgeführt
            System.out.println("gar");
          case 8:
            // Und danach dieser, weil der vorherige kein break hat, und deshalb ohne Überprüfung
            // in den nächsten case gesprungen wird ("fall-through" behavior)
            System.out.println("nicht");
            // Die Exception unterbricht den Programmlauf, es wird also nicht in den default-case gesprungen
            throw new Exception(); 
          default:
            System.out.println("keinen");
            break;
        }
      } catch (Exception e) {
        // zahl % 6 = 1, (7 % 6 % 2) = (1 % 2) = 1, also 1 / 1 = 1, es kommt true raus, also wird "so" ausgegeben
        String s = (zahl % 6 / (7 % 6 % 2)) == 1 ? "so" : "Sommer";
        System.out.println(s);
        // Trotz return wird der finally Block noch ausgeführt bevor die Methode abgebrochen wird
        return;
      } finally {
        // "schlimm" wird ausgegeben und danach wegen return abgebrochen
        System.out.println("schlimm!");
      }
      // Dieser Teil wird also nicht mehr ausgeführt
      System.out.println("glücklich");
    }
  }
  