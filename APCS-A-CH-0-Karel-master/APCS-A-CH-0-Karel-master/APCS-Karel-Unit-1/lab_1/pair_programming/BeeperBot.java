package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  Drew Campillo
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
       finish();
    }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
       
    }
    public void moveThree(){
        move();
        move();
        move();
    }
    public void finish(){
        turnLeft();
        turnLeft();
        move();
        move();
        pickBeeper();
        moveThree();
        pickBeeper();
        turnRight();
        moveThree();
        pickBeeper();
        turnRight();
        moveThree();
        pickBeeper();
        move();
        move();
        turnRight();
        moveThree();
    }
}


