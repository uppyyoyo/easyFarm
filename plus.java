import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plus extends Actor
{
    /**
     * Act - do whatever the plus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int Timer = 300;
    //public static final int plus = 10;
    public void act() 
    {
        Timer--;
        
        touchFarmer();
        if (Timer == 0) {
            getWorld().removeObject(this);
        }
    }   
    public void touchFarmer(){
       if (isTouching(farmer.class) || isTouching(carater.class)){
        farmer.power += 10;
        getWorld().removeObject(this);
        }
    } 
}
