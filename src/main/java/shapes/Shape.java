package shapes;

import java.awt.*;

public abstract class Shape {
    protected Point p;
    protected Color c;

    public Shape(Point p, Color c) {
        this.p = p;
        this.c = c;
    }

    public abstract void draw(Graphics g);
}
