import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blackrainNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blackrainNormal extends Actor
{
    public void act() 
    {
        movedown();
    }    
    public void movedown()
    {
            int ypos = getY(); //get the current position
          // check if missile hasn't reached the top
            if (ypos > 0)        
            {
               ypos = ypos + 4;  // reduce the ypos so it's "higher" than before
               setLocation(getX(),ypos); //set the new location = move UP
               // destroy enemy
               
            } else  {
                
                getWorld().removeObject(this);
            
            }
            if (getY() == 399) {
                getWorld().removeObject(this);
            }
    }
    private raincloudForNormal myShip;
    
   public   blackrainNormal(raincloudForNormal myShip)
    {
            this.myShip = myShip;
        
    }   
}
