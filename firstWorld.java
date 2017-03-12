import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class firstWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class firstWorld extends World
{

    /**
     * Constructor for objects of class firstWorld.
     * 
     */
    GreenfootSound backgroundMusic = new GreenfootSound("Farm Frenzy 1 ost Ingame Track.wav");
    public firstWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        addObject(new easy(), 200, 325);
        addObject(new normal(), 500, 325);
        addObject(new hard(), 800, 325);
        addObject(new logo(), getWidth()/2, getHeight()/2 - 68);
        addObject(new linkhowto(), 890, 37);
        
        //Greenfoot.playSound("Farm Frenzy 1 ost Ingame Track.wav");
    }
    
    int time = 100;
    int time2 = 400;
    boolean doplay = false;
    public void act() {
        if (!doplay) {
            backgroundMusic.play();
            doplay = true;
            
        }
         
          //  backgroundMusic.pause();
        
        time--;
        time2--;
        
        if (time == 0) {
        randomAero();
        time = 800;
       }
       if (time2 == 0) {
        randomAero2();
        time2 = 400;
       }
    }
    public void randomAero() {
        int x = Greenfoot.getRandomNumber(2)+1;
        int y = Greenfoot.getRandomNumber(130) + 3;
        addObject(new aeroplane("" + x), 999, y);
    }
    
    public void randomAero2() {
        int x = Greenfoot.getRandomNumber(2)+1;
        int y = Greenfoot.getRandomNumber(130) + 3;
        addObject(new aeroplane2("aero3.png"), 1, y);
    }
}
