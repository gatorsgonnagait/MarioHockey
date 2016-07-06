import java.awt.*;

/**
 * Created by Mesa on 7/1/2016.
 */
//test4
public class Goalie extends Player {

    public Goalie(Point point, int speed, double angle, int width, int length) {
        super(point, speed, angle, width, length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(45);
    }
}
