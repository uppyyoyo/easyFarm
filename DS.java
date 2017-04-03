import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DS extends HellMap
{
    /**
     * Act - do whatever the DS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int R = 0;
    
    
    public void act() 
    {
             R++;
             if(R < 20){
                 spon();
             }
                
             if(R > 500){
                 setLocation(getX(), getY()-5);
                 if(isAtEdge()){getWorld().removeObject(this);}
                }
                turnTowards(carater.x, carater.y);
             
             if(Greenfoot.getRandomNumber(1000) < 10){
                  getWorld().addObject(new monster(), getX(),getY());
                }
             
           
    }    
    
    public void spon(){
        setLocation(getX(), getY()+5);
        
    }
    
}
