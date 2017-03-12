import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class raincloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class raincloud extends Actor
{
    int Timer4 = 350;
    
  
    
    public void act() 
    {
        
        Timer4--;
        
       
       movedown2();
       shoot();
       if (Timer4 == 0){
           getWorld().removeObject(this);
           Timer4 = 350;
        }
        
    }    
    private int shotTimer = 0;
    int timer = 30;
 
    public void movedown2(){
 
    int ypos2 = getY(); 
      if (ypos2 < 120) {
          ypos2 = ypos2 +1;
          setLocation(getX(), ypos2);
        }
        
    }
    
    public void shoot(){
        timer--;
        
        if (timer == 0) {
        
            for (int i = 0 ; i <= 1 ; i++) {
            int x = Greenfoot.getRandomNumber(100);
            int p = Greenfoot.getRandomNumber(2);
            getWorld().addObject(new rain(this), getX()-50 + x, getY());
           }
            
            
            
           timer = 50;
        
       }
}
}
