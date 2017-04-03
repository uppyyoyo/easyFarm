import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playagain3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playagain3 extends Actor
{
    /**
     * Act - do whatever the playagain3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new hardWorld());
            scorecounteer.score = 0;
            hardWorld.monsterCount =40;
            normalWorld.monsterCount =30;
            easyWorld.monsterCount =20;
            
            farmerEasy.power = 200;
            farmer.power = 200;
            carater.power = 200;
            scorecounteer.score = 0;
        }
    }    
}
