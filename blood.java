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
    
    int count = 0;
    
    public void act() 
    {
       setLocation(getX(), getY()+4);
       if(isAtEdge()){
           
            getWorld().removeObject(this);
            
        }
       else if(isTouching(seedHell.class)){
           count++;
            if(count == 2){
               getWorld().removeObject(this);
            }
        }
        
    }    
}
