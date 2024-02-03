package org.adnanarch.learnspringweb.game;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jumping.");
    }

    @Override
    public void down() {
        System.out.println("Going into whole.");
    }

    @Override
    public void left() {
        System.out.println("Moving Backward.");
    }

    @Override
    public void right() {
        System.out.println("Accelerating.");
    }
}
