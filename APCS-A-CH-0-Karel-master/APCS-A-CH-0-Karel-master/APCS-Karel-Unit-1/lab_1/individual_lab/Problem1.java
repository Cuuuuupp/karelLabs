package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnLeft();
        movetwo();
        turnRight();
        movetwo();
        turnRight();
        pickupBeeper();
        turnRight();
        movetwo();
        turnRight();
        movetwo();
        turnRight();
        putdownBeeper();
    }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    public void pickupBeeper() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void putdownBeeper() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
    }
    public void movetwo(){
    move();
    move();
}
    
}