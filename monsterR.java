import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monsterR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monsterR extends Actor
{
    /**
     * Act - do whatever the monsterR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        move(-2);
        delete();
       
    }  
    public monsterR(String pic){
        setImage(pic + ".png");
    }
    public void delete(){
        if (isTouching(flowers.class)||isTouching(tree.class)) {
            getWorld().removeObject(this);
           scorecounteer.score++;
        
        }else if (isAtEdge()) {
              setImage("emtly.png");
             getWorld().removeObject(this);
           
        }
    }
}
