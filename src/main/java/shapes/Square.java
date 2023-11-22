package shapes;

import shapes.Rectangle;

import java.awt.*;

public class Square extends Rectangle {
    public Square(int height, Point p, Color c){
        super(height,height, p, c);
    }
   // @Override
   // public void draw(Graphics g){
       // g.fillRect(p.x, p.y, height, height);
    //}
}
