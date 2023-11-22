package shapes;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int r, Point p, Color c){
        super(p, c);
        this.radius=r;
    }
    @Override
    public void draw(Graphics g){
        g.fillOval(p.x, p.y, radius, radius);
    }
}
