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

    public void setLocation(Player p){
        this.point = p.getPoint();
    }

    public void setSize(int width, int length ) {
        super.setWidth(70);
        super.setLength(15);
    }

    public void drawStick(Graphics g, Player p){
        // draw Line2D.Double
        //g2.draw(new Line2D.Double(x1, y1, x2, y2));
        Point stickGrip = p.getPoint();

        g.drawLine(new Line2D());
    }
}
