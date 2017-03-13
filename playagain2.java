import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playagain2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playagain2 extends Actor
{
    /**
     * Act - do whatever the playagain2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new normalWorld());
            scorecounteer.score = 0;
            hardWorld.monsterCount =40;
            normalWorld.monsterCount =30;
            easyWorld.monsterCount =20;
            scorecounteer.score = 0;
        }
    }    
}
