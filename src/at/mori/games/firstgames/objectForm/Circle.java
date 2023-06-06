package at.mori.games.firstgames.objectForm;

import org.newdawn.slick.Graphics;

public class Circle {
    private float x;
    private float y;
    private float speed;

    public Circle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x,this.y,50,50);
    }

    public void update(int delta){
        this.y += delta/this.speed;
        if (this.y>600){
            this.y = 0;
        }
    }
}
