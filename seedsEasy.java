import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class seedsEasy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class seedsEasy extends Actor
{
    /**
     * Act - do whatever the seedsEasy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private boolean check = false;
    int time = 400;
    public void act() 
    {
      time--;
     
        
      
        if (!check) {
        if (isTouching(rain.class)){
            getWorld().addObject(new flowers(), getX(), getY() - 23);
            getWorld().removeObject(this);
            check = true;
        }
    } else if (!isTouching(rain.class))  {
        check = false;
    }
    
    if (time == 0) {
        getWorld().removeObject(this);
        time = 400;
    }
    
   }
    
   public seedsEasy(String pic){
        setImage(pic + ".png");
    }
    
   
}
