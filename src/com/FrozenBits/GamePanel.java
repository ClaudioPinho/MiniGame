package com.FrozenBits;

import com.FrozenBits.Map.Map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

@SuppressWarnings("unused")
public class GamePanel extends JPanel implements Runnable, MouseListener, KeyListener{

    private final long FRAMES = 60;
    private final long targetTime = 1000/FRAMES;

    private Graphics2D graphics2D;
    private BufferedImage bufferedImage;

    private Map map;

    private Thread thread;

    private boolean running;

    public GamePanel(){
        super();
        setFocusable(true);
        requestFocus();
    }

    @Override
    public void addNotify(){
        super.addNotify();
        if (thread == null){
            thread = new Thread(this);
            addKeyListener(this);
            addMouseListener(this);
            running = true;
            thread.start();
        }
    }

    public void init(){

        bufferedImage = new BufferedImage(Main.WIDTH, Main.HEIGHT, BufferedImage.TYPE_INT_ARGB);

        graphics2D = (Graphics2D) bufferedImage.getGraphics();

        graphics2D.setColor(Color.BLACK);
        graphics2D.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);

        map = new Map();

    }

    public void tick(){

        map.tick();

    }

    public void draw(){

        map.draw(graphics2D);

    }

    public void drawToScreen(){

        Graphics graphics = getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();

    }

    @Override
    public void run() {

        long startTimer = System.currentTimeMillis();

        init();

        while (running){

            long elapsed, next;

            next = System.currentTimeMillis();

            elapsed = next - startTimer;

            if (elapsed >= targetTime){

                startTimer = System.currentTimeMillis();

                tick();
                draw();
                drawToScreen();

            }

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
