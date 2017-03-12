import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class winWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class winWorld extends World
{

    /**
     * Constructor for objects of class winWorld.
     * 
     */
    public winWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        addObject(new back(), 930, 340);
        addObject(new winner(), getWidth()/2, getHeight()/2);
    }
}
