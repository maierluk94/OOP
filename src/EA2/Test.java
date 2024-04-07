package EA2;

public class Test {
    public static void main(String[] args) {
        HagenGames hg = new HagenGames();
        K1618Restricted game = hg.buyGame();

        game.playGame();
        // game.update(); führt zu einem Compilerfehler
        hg.updateK1618(game);
        game.playGame();
    }
}

class HagenGames {
    public K1618Restricted buyGame() {
        return new K1618();
    }

    public void updateK1618(K1618Restricted k1618) {
        ((K1618)k1618).update();
    }
}

interface K1618Restricted {
    public void playGame();
}

class K1618 implements K1618Restricted {
    private double version = 1.0;

    public void playGame() {
        System.out.println("Running Kurs1618, Version " + version);
    }

    public void update() {
        version = version + 0.1;
    }
}

