package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
      gohardinthepaint();
      gohardinthepaint();
      gohardinthepaint();
      gohardinthepaint();
    }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    public void moveTwo() {
        move();
        move();
    }
    public void gohardinthepaint() {
        turnRight();
        move();
        goLeft();
        goRight();
        goRight();
        turnLeft();
        moveTwo();
        turnLeft();
        move();
        turnLeft();
    }
    public void goLeft() {
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
    }
    public void goRight() {
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
    }
}