package com.FrozenBits;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    private static JFrame frame;

    private static final String gameTitle = "teste";

    public static void main(String[] args) {

        frame = new JFrame(gameTitle);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.add(new GamePanel());
        frame.setVisible(true);

    }
}
