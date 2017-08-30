package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        placeRowOne();
        placeRowTwo();
        placeRowThree();
        placeRowFour();
        
        
        
    }
    public void moveTwo(){
        move();
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnAround() {
        turnRight();
        turnRight();
    }
    public void placeRowOne() {
        move();
        putBeeper();
        turnLeft();
        move();
        turnRight();
        move();
    }
    public void placeRowTwo() {
        putBeeper();
        turnRight();
        moveTwo();
        putBeeper();
        move();
        turnLeft();
        move();
    }
    public void placeRowThree() {
        putBeeper();
        turnLeft();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
        turnRight();
        move();
    }
    public void placeRowFour(){ 
        putBeeper();
        turnRight();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
    }

        
}
