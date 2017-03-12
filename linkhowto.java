import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class linkhowto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class linkhowto extends Actor
{
    /**
     * Act - do whatever the linkhowto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new howtoplay());
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("how2.png");
          
        }else {
            setImage("how.png");
        }
    }    
}
