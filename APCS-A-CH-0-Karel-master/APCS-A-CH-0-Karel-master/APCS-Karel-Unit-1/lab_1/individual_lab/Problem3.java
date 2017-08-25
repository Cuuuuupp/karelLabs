package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        turnRight();
        move3();
        putBeeper();
        turnLeft();
        turnLeft();
        move3();
        turnRight();
        
        
    }
    
    public void pickAndMoveBeeper() {
        pickBeeper();
        turnLeft();
        moveTwo();
        putBeeper();
        turnLeft();
        turnLeft();
        moveTwo();
        turnLeft();
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
    public void move3() {
        move();
        move();
        move();
    }
}

