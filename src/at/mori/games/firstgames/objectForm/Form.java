package at.mori.games.firstgames.objectForm;

import at.mori.games.firstgames.Forms;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Form extends BasicGame {
    public Form(String title) {
        super(title);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Form("Form"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    private List<Rectangle> rectangles;
    private List<Circle> circles;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangles = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(100), random.nextInt(600), random.nextInt(20));
            rectangles.add(rectangle);
        }
        this.circles = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Circle circles = new Circle(random.nextInt(800), random.nextInt(600), random.nextInt(20));
            this.circles.add(circles);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.update(delta);
        }
        for (Circle circle:this.circles) {
            circle.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangle : this.rectangles) {
            rectangle.render(graphics);
        }
        for (Circle circle:this.circles) {
            circle.render(graphics);
        }
    }
}
