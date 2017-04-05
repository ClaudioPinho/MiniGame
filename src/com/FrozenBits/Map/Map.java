package com.FrozenBits.Map;

import com.FrozenBits.Entity.Entity;
import com.FrozenBits.Entity.Player;

import java.awt.*;
import java.util.ArrayList;

public class Map {

    private ArrayList<Entity> entities = new ArrayList<>();

    private Player player;

    public Map(){

        init();

    }

    public void init(){

        player = new Player(0, 0, 1.5f, 100);

        entities.add(player);

    }

    public void draw(Graphics2D graphics2D){
        for (Entity entity : entities){
            entity.render(graphics2D);
        }
    }

    public void tick(){
        for (Entity entity : entities){
            entity.tick();
        }
    }
}
