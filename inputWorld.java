import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inputWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inputWorld extends World
{

    /**
     * Constructor for objects of class inputWorld.
     * 
     */
    public inputWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        addObject(new input(), getWidth()/2, (getHeight()/2)- 35);
        addObject(new enter(), (getWidth()/2), (getHeight()/2)+40);
        showText("Enter your name",(getWidth()/2), (getHeight()/2) - 66);
    }
}
