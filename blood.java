import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blood extends HellMap
{
    /**
     * Act - do whatever the blood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    public void act() 
    {
       setLocation(getX(), getY()+5);
       if(isAtEdge()){
           
            getWorld().removeObject(this);
            
        }
    }    
}
