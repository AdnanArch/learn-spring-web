package org.adnanarch.learnspringweb.game;

public class PacmanGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Going Up");
    }

    @Override
    public void down() {
        System.out.println("Going Down.");
    }

    @Override
    public void left() {
        System.out.println("Going Left.");
    }

    @Override
    public void right() {
        System.out.println("Going Right.");
    }
}
