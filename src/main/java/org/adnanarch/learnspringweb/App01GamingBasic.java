package org.adnanarch.learnspringweb;

import org.adnanarch.learnspringweb.game.GameRunner;
import org.adnanarch.learnspringweb.game.MarioGame;
import org.adnanarch.learnspringweb.game.PacmanGame;
import org.adnanarch.learnspringweb.game.SuperContraGame;

public class App01GamingBasic {
    public static void main(String[] args) {
//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();
        PacmanGame game = new PacmanGame(); // Object Creation

        GameRunner gameRunner = new GameRunner(game); // Object Creation + Wiring Dependencies
        // Game is a dependency of GameRunner.

        gameRunner.run();
    }
}
