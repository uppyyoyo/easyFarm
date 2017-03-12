import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flowers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flowers extends Actor
{
    int time2 = 100;
    int time3 = 280;
    int time4 = 70;
    int second = 3; 
    public void act() 
    {
        time2--;
        time3--;
        time4--;
        if (time4 == 0) {
            if (second >= 0) {
            getWorld().showText("" + second,950, 145);
            
            second -= 1;
            }
            time4 = 70;
        }
      int x = Greenfoot.getRandomNumber(2)+3;
        if (time2== 80) {
          setImage("flow1.png");
        }
        if (time2== 40) {
          setImage("flow2.png");
        }
        if (time2== 0) {
          setImage("flow" + x + ".png");
        }
         if (time3== 0) {
            
            setLocation(0, 0);
            setImage("emtly.png");
            time3 = 230;
         }
     
    }
    
    
    
}
