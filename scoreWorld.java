import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreWorld extends World
{

    /**
     * Constructor for objects of class scoreWorld.
     * 
     */
    String[] pic = {"cloud","cloud2","cloud3"}; 
    int Timer2 = 10;
    public scoreWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        showText("score : " + scorecounteer.score, getWidth()/2, getHeight()/2 - 30);
        addObject(new back(), getWidth()/2, getHeight()/2 + 40);
    }
    public void act(){
        Timer2--;
     if (Timer2 == 0) {
           randomCloud();
            Timer2 = 200;
        }
    }
    public void randomCloud(){
        int x= Greenfoot.getRandomNumber(3);
        int y= Greenfoot.getRandomNumber(110);
        addObject(new clouds(pic[x]), 0, y);
        
    }
}
