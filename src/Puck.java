import java.awt.*;

/**
 * Created by Mesa on 7/1/2016.
 */
//test4
public class Puck extends MovingObject {

    public Puck(Point point, int speed, double angle, int width, int length) {
        super(point, speed, angle, width, length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(30);
    }
}
