import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mesa on 7/1/2016.
 */
///test
public class UI {
    //Rectangle bounds = new Rectangle(700, 1000, 350, -500);
    JFrame frame = new JFrame();
    //Canvas canvas = new Canvas();
    JPanel panel = new JPanel();

    public void createFrame(){
        //frame.setMaximizedBounds(bounds);
        frame.setPreferredSize(new Dimension(1000, 560));
        frame.setBackground(Color.LIGHT_GRAY);
        frame.add(new Rink());
        //frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void resetGameState(Player p1, Player p2, Player p3, Player p4, Goalie g1, Goalie g2){
        p1.setLocation(new Point(-3, 0));
        p2.setLocation(new Point(0, -3));
        p3.setLocation(new Point(-15, 15));
        p4.setLocation(new Point(15, -15));
        g1.setLocation(new Point(0, -50));
        g2.setLocation(new Point(50, 0));
    }

    public void scoreboard(){
        int scoreRed = 0;
        int scoreBlue = 0;
        JLabel scoreLabel1 = new JLabel("Red: 0");
        JLabel scoreLabel2 = new JLabel("Blue: 0");

    }

    public void updateRedScore(JLabel team, int score){
        score++;
        team.setText("Score: " + score);
    }

    public void updateBlueScore(JLabel team, int score){
        score++;
        team.setText("Blue: " + score);
    }

    public void timer(){
        Timer clock = new Timer(300, new ActionListener() {
            int counter = 300;
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                if(counter == 0){
                    //end game
                }
            }
        });
    }

    //time
    //charge bar




}
