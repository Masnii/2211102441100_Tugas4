import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter = new Counter("");
        addObject(counter,61,25);
        Counter2 counter2 = new Counter2("HP : ");
        addObject(counter2,237,26);
        Woman woman = new Woman();
        addObject(woman,153,390);
        counter2.setLocation(281,382);
        counter2.setLocation(74,469);
        counter.setLocation(48,32);
        Noodle noodle = new Noodle();
        addObject(noodle,197,139);
        Sandwich sandwich = new Sandwich();
        addObject(sandwich,59,216);
        Pir pir = new Pir();
        addObject(pir,92,99);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,258,139);
        Wortel wortel = new Wortel();
        addObject(wortel,131,171);
    }
}
