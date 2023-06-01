package at.mori.games.firstgames;


import org.newdawn.slick.*;

public class Forms extends BasicGame {
    private float recx;
    private float recy;
    private float ovalx;
    private float ovaly;
    private float cirx;
    private float ciry;
    private int directionoval;
    private int directioncir;


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Forms("Forms"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public Forms(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.recx = 100;
        this.recy = 100;
        this.ovalx = 100;
        this.ovaly = 0;
        this.directionoval = 0;
        this.directioncir = 0;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (this.recx <= 600 && this.recy <= 100){
            this.recx += (float) delta/2.0;
        } else if (this.recx >= 600 && this.recy <= 400){
            this.recy += (float) delta/2.0;
        } else if (this.recx >= 100 && this.recy <= 500){
            this.recx -= (float) delta/2.0;
        } else if (this.recx <= 100 && this.recy >= 100){
            this.recy -= (float) delta/2.0;
        }

        if (this.ovalx <= 600 && this.directionoval == 0){
            this.ovalx += (float) delta/2.0;
            if (this.ovalx >= 600){
                this.directionoval = 1;
            }
        } else if (this.ovalx >= 100 && this.directionoval == 1){
            this.ovalx -= (float) delta/2.0;
            if (this.ovalx <= 100){
                this.directionoval = 0;
            }
        }

        if (this.ciry <= 400 && this.directioncir == 0){
            this.ciry += (float) delta/2.0;
            if (this.ciry >= 400){
                this.directioncir = 1;
            }
        } else if (this.ciry >= 100 && this.directioncir == 1){
            this.ciry -= (float) delta/2.0;
            if (this.ciry <= 100){
                this.directioncir = 0;
            }
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.recx,this.recy,100,100);
        graphics.drawOval(this.cirx,this.ciry,100,100);
        graphics.drawOval(this.ovalx,this.ovaly,100,50);
    }
}
