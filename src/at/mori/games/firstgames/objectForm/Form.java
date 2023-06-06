package at.mori.games.firstgames.objectForm;

import at.mori.games.firstgames.Forms;
import org.newdawn.slick.*;

public class Form extends BasicGame {
    public Form(String title) {
        super(title);
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Form("Form"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    private Rectangle rectangle;
    private Rectangle rectangle2;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(10,10,2);
        this.rectangle2 = new Rectangle(10,50,2);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangle.update(delta);
        this.rectangle2.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
        this.rectangle2.render(graphics);
    }
}
