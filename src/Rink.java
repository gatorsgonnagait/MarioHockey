import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

/**
 * Created by Mesa on 7/1/2016.
 */
public class Rink extends JPanel{

    public void paintComponent(Graphics g){

        Graphics2D rink = (Graphics2D) g;

        rink.draw(new RoundRectangle2D.Double(100, 100, 800, 360, 170, 170));

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
