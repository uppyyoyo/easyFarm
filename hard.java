import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hard extends Actor
{
    /**
     * Act - do whatever the hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HellWorld());
            firstWorld.backgroundMusic.stop();
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("hard2.png");
          
        }else {
            setImage("hard.png");
        }
        
    }    
}
