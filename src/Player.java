import java.awt.*;

/**
 * Created by Mesa on 7/1/2016.
 */
//test4



public class Player extends MovingObject {




    public Player(Point point, int speed, double angle, int width, int length) {
        super(point, speed, angle, width, length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(52);
    }


    public void playerLocation(Player p){
        p.setLocation();
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
