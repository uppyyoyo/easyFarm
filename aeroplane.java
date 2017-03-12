import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aeroplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aeroplane extends Actor
{
    /**
     * Act - do whatever the aeroplane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }   
    public aeroplane(String pic) {
        setImage("aero" + pic + ".png");
    }
}
