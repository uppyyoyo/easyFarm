import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hell extends HellMap
{
    /**
     * Act - do whatever the hell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HellWorld());
            firstWorld.backgroundMusic.stop();
        }
        if (Greenfoot.mouseMoved(this)) {
            setImage("hell2.png");
          
        }else {
            setImage("hell.png");
        }
    }
}
