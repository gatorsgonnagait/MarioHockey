import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

/**
 * Created by Mesa on 7/1/2016.
 */
public class Rink {

    public static void drawRink(Graphics g){
        Graphics2D rink = (Graphics2D) g;

        r
        rink.draw(new RoundRectangle2D.Double(0, 0, 200, 85, 15, 15));

        rink.draw(new Line2D.Double(0, 0, 100, -100));// 5 vertical lines on rink
        rink.draw(new Line2D.Double(0, 0, 100, -100));
        rink.draw(new Line2D.Double(0, 0, 100, -100));
        rink.draw(new Line2D.Double(0, 0, 100, -100));
        rink.draw(new Line2D.Double(0, 0, 100, -100));

        rink.fillOval(-25, 25, 20, 20);//5 circles on hockey rink
        rink.fillOval(-25, -25, 20, 20);
        rink.fillOval(0, 0, 20, 20);
        rink.fillOval(25, 25, 20, 20);
        rink.fillOval(25, -25, 20, 20);
    }

}
