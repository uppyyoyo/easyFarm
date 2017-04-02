import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monster extends HellMap
{
    /**
     * Act - do whatever the monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r;
    public void act() 
    {
       
        turnTowards(carater.x,carater.y);
       
       move(5);
       
       if (isTouching(carater.class)){
           
           carater.power -=20;
           getWorld().removeObject(this);
        }
        
       else if(isTouching(tree.class)){
            getWorld().removeObject(this);
        }
    }    
    
 
    
}
