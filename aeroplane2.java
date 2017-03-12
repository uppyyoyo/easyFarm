import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aeroplane2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aeroplane2 extends Actor
{
    /**
     * Act - do whatever the aeroplane2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }   
    public aeroplane2(String pic) {
       
        setImage(pic);
    }
    }   

