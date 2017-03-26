import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DS extends HellMap
{
    /**
     * Act - do whatever the DS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int R;
    
    public void act() 
    {
         
        R = getRotation();
        turnTowards(carater.x, carater.y);
    }    
}
