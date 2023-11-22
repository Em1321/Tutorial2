package shapes;

import java.awt.*;

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(int w, int h, Point p, Color c){
        super(p, c);
        this.width=w;
        this.height=h;

    }
    @Override
    public void draw(Graphics g){
        g.fillRect(p.x, p.y, width, height);
    }

}
