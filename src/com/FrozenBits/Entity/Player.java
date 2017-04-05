package com.FrozenBits.Entity;

import com.FrozenBits.Utils.ImageLoad;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {

    private BufferedImage texture = new ImageLoad("/Entity/Player/player-idle.png").getImage();

    public Player(float x, float y, float velocity, int life){
        super(x, y, velocity, life);
        setTexture(texture);
    }

    @Override
    public void render(Graphics2D graphics2D) {

        graphics2D.drawImage(getTexture(), (int)getX(), (int)getY(), null);

        graphics2D.setColor(Color.RED);
        graphics2D.drawRect((int)getX(), (int)getY(), getTexture().getWidth(), getTexture().getHeight());
    }

    @Override
    public void tick() {

    }
}
