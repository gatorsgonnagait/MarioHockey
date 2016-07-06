import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Mesa on 7/5/2016.
 */
//test21321
public class Stick extends MovingObject{

    public Stick(Point point, int speed, double angle, int width, int length) {
        super(point, speed, angle, width, length);
    }



    public void setSize(int width, int length ) {
        super.setWidth(20);
        super.setLength(70);
    }

    public void drawStick(Graphics g, Player p){
        // draw Line2D.Double
        //g2.draw(new Line2D.Double(x1, y1, x2, y2));

        int a = getLocation().x;
        int b =  getLocation().y;
        int x = (int)( a + getLength() * Math.cos(getAngle()));
        int y = (int) ( b + getLength() * Math.sin(getAngle()));
        g.drawLine(a, b, x, y);
    }
}
