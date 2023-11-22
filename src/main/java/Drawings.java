

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

import java.awt.*;
import java.util.ArrayList;

public class Drawings extends Canvas {
    private Circle circ;
    private shapes.Rectangle rect;
    private Square squ;
    ArrayList<shapes.Shape> shapeList= new ArrayList<Shape>();

    public  Drawings() {
        circ= new Circle(100, new Point(250, 250), Color.red);
        rect= new Rectangle(100,100, new Point(100, 100), Color.red);
        squ= new Square(50,new Point(200, 200), Color.red);
        shapeList.add(circ);
        shapeList.add(rect);
        shapeList.add(squ);
    }
    public void paint(Graphics g) {
        for (int i = 0; i < shapeList.size(); i++) {
            shapeList.get(i).draw(g);
        }
    }



}
