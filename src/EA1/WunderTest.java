package EA1;

public class WunderTest {
    public static void main(String[] args) {
        int longest = 0;
        int longestSteps = 0;

        for (int i = 1; i <= 100; i++) {
            int steps = wunder(i);
            if (steps > longestSteps) {
                longest = i;
                longestSteps = steps;
            }
        }

        System.out.printf("Die meisten Schritte brauchte die Zahl %d mit %d Schritten.", longest, longestSteps);
    }

    public static int wunder(int n) {
        int steps = 0;
        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            steps++;
        } 
        return steps;
    }

    public static int wunderRek(int n) {
        if (n == 1) {
            return 0;
        }
        else {
            return wunderRek(n % 2 == 0 ? n / 2 : n * 3 + 1, 1);
        }
    }

    private static int wunderRek(int n, int steps) {
        if (n == 1) {
            return steps;
        }
        else {
            return wunderRek(n % 2 == 0 ? n / 2 : n * 3 + 1, steps + 1);
        }
    }
}
