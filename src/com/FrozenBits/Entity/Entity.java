package com.FrozenBits.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Entity {

    private float x, y;
    private float velocity;
    private int life;
    private int protection;
    private int energy, stamina;

    private BufferedImage texture;

    public Entity(float x, float y, float velocity, int life){

        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.life = life;

    }

    public abstract void render(Graphics2D graphics2D);

    public abstract void tick();

    public BufferedImage getTexture() {
        return texture;
    }

    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
