import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class easy extends Actor
{
    /**
     * Act - do whatever the easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new easyWorld());
            firstWorld.backgroundMusic.stop();
          
        }
         if (Greenfoot.mouseMoved(this)) {
            setImage("easy2.png");
           
        }else {
            setImage("easy.png");
        }
    }    
}
