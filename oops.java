import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oops extends Actor
{
   GreenfootImage p1 = new GreenfootImage("emtly.png");
   GreenfootImage p2 = new GreenfootImage("oops.png");
    int time2 = 200;
    int time3 = 200;
    public void act() 
    {
      
        time2--;
        time3--;
        if (time2 == 170) {
            setImage(p1);
        }
        if (time2 == 120) {
            setImage(p2);
        }
        if (time2 == 40) {
            setImage(p1);
        }
        if (time2 == 0) {
            getWorld().removeObject(this);
         time2 = 200;
        }
    }  


}
