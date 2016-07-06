/**
 * Created by Mesa on 7/1/2016.
 */

import java.awt.*;
public class MovingObject {

    Point point;
    int speed;
    double angle;
    int width;
    int height;


    public MovingObject(Point point, int speed, double angle, int width, int height) {
        this.point = point;
        this.speed = speed;
        this.angle = angle;
        this.width = width;
        this.height = height;
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

    public void setRadius(int radius){
        this.radius = radius;
    }





}
