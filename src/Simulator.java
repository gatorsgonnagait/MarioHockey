import java.awt.*;

/**
 * Created by Mesa on 7/1/2016.
 */
public class Simulator {

    //object movement

    //object speed
    // puck angle
    static Puck puckobj ;

    public void puckAngle(double passAngle){
        puckobj.setAngle(passAngle);
    }

    public void puckSpeed(int passShot){
        puckobj.setSpeed(passShot);
    }
    public void puckLocation(Point pt){
        puckobj.setLocation(pt);
    }

    Player p1;
    public void player1Angle(double angle){
        p1.setAngle(angle);
    }

    public void player1Speed(int speed){
        p1.setSpeed(speed);
    }

    public void player1Location(Point pt){
        p1.setLocation(pt);
    }

    Player p2;
    public void player2Angle(double angle){
        p2.setAngle(angle);
    }

    public void player2Speed(int speed){
        p2.setSpeed(speed);
    }

    public void player2Location(Point pt){
        p2.setLocation(pt);
    }

    Player p3;
    public void player3Angle(double angle){
        p3.setAngle(angle);
    }

    public void player3Speed(int speed){
        p3.setSpeed(speed);
    }

    public void player3Location(Point pt){
        p3.setLocation(pt);
    }

    Player p4;
    public void player4Angle(double angle){
        p4.setAngle(angle);
    }

    public void player4Speed(int speed){
        p4.setSpeed(speed);
    }

    public void player4Location(Point pt){
        p4.setLocation(pt);
    }







    //objects colliding
        //players collide
        //puck hits back of player
        //puck hits goal post
        //puck gets grabbed by player

    //if puck crossed this spot, thats a goal
    //goalie behavior

    //player properties
        //puck possesion
        //pass puck,
        //soft shot
        //hard shot
        //body check
        //steal


}
