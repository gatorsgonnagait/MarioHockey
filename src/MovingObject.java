/**
 * Created by Mesa on 7/1/2016.
 */
//test
import java.awt.*;
public class MovingObject {

    Point point;
    int speed;
    double angle;
    int width;
    int length;
//4

    public MovingObject(Point point, int speed, double angle, int width, int length) {
        this.point = point;
        this.speed = speed;
        this.angle = angle;
        this.width = width;
        this.length = length;
    }

    public Point getPoint() {
        return point;
    }

    public void setLocation(Point point) {
        this.point = point;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
