import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
import java.awt.Color;
/**
 * Write a description of class input here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class input extends Actor
{
    /**
     * Act - do whatever the input wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    static final int MAX_INPUT_LENGTH = 20;
    static String text = "";
     
    public input()
    {
        updateImage();
        text = "";
    }
     
    private void updateImage()
    {
    GreenfootImage image = new GreenfootImage(16*MAX_INPUT_LENGTH+32, 30);
    image.setColor(new Color(128, 0, 0));
    image.fill();
    image.setColor(Color.lightGray);
    image.fillRect(3, 3, image.getWidth()-6, 24);
    for (int i=0; i<text.length(); i++)
    {
        GreenfootImage chrImage = new GreenfootImage(""+text.charAt(i), 24, Color.black, null);
        image.drawImage(chrImage, 24+16*i-chrImage.getWidth()/2, 15-chrImage.getHeight()/2);
    }
    setImage(image);
}

    static String xxx = "";
    public void act()
    {
        String key = Greenfoot.getKey();
        xxx = text;
        if (key == null) return;
        if ("enter".equals(key) && text.length() > 0)
        {
            xxx = text;

            updateImage();
            
            Greenfoot.setWorld(new firstWorld());
            return;
        }
        
        if ("backspace".equals(key) && text.length() > 0) text = text.substring(0, text.length() - 1);
        if ("escape".equals(key)) text = "";
        if ("space".equals(key)) key = " ";
        if (key.length() == 1 && text.length() < MAX_INPUT_LENGTH) text += key;
        updateImage();
    }


   
}
