import java.awt.*;

/**
 * Created by Mesa on 7/1/2016.
 */
//test



public class Player extends MovingObject {




    public Player(Point point, int speed, double angle, int radius) {
        super(point, speed, angle, radius);
    }

    @Override
    public void setRadius(int radius) {
        super.setRadius(45);
    }


    public void playerLocation(Player p){
        p.g
    }

    public void pass(Puck puck, Player p){
        puck.setAngle(p.getAngle());
        puck.setSpeed(3);
    }

    public void wristShot(Puck puck, Player p){
        puck.setAngle(p.getAngle());
        puck.setSpeed(2);
    }
    public void slapShot(Puck puck, Player p){
        puck.setAngle(p.getAngle());
        puck.setSpeed(6);
    }

    public void bodyCheck(){

    }

    public void steal(){

    }


}
