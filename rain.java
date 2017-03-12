import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rain extends Actor
{
    /**
     * Act - do whatever the rain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
    private raincloud myShip;
    
   public   rain(raincloud myShip)
    {
            this.myShip = myShip;
        
    }
}
