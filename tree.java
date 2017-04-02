import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree extends HellMap
{
    /**
     * Act - do whatever the tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int scaleCount = 0;
    
    
    public void act() 
    {
        scaleCount += 5;
        getScale();
    }    
    
    
    public void getScale(){
        
      
        if(scaleCount == 1000){
            getWorld().removeObject(this);
        }
        
       
        
    }
}
