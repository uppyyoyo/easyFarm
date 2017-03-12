import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clouds extends Actor
{
    /**
     * Act - do whatever the clouds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public clouds(String image){
        setImage(image + ".png");
    }
    public void act() 
    {
        if (getX() == 870) {
            getWorld().removeObject(this);
        }
        move(1);
    }    
}
