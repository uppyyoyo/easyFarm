import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playagain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playagain extends Actor
{
    /**
     * Act - do whatever the playagain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new easyWorld());
            scorecounteer.score = 0;
            hardWorld.monsterCount =40;
            normalWorld.monsterCount =30;
            easyWorld.monsterCount =20;
            scorecounteer.score = 0;
        }
    }    
}
