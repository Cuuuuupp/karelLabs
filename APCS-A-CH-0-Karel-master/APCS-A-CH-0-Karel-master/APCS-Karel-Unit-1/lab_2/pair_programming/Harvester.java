package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    /**
     * Precondition: robot facing east one block away from a row of beepers
     * postcondition: robot facing east, two streets above where it started, one block away from a beeper
     */ 
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
    }
    public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    }
    public void repositionLeft() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void harvestOneRow() {
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
    }
    
    


   

