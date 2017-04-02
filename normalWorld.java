import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   
public class normalWorld extends World
{
    int Timer = 90;
    int Timer2 = 300;
    int Timer3 = 100;
    int Timer4 = 400;
    int Timer5 = 400;
    int Timer6 = 400;
    int Timer7 = 600;
    String[] pic = {"cloud","cloud2","cloud3"}; 
   
    public normalWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        
        addObject(new seedpack(),950,50);
        addObject(new countT(),950,130);
        addObject(new heart(),50,50);
        addObject(new scorebb(),950,220);
        addObject(new exit(),980,380);
        addObject(new playagain2(),945,380);
        addObject(new door(),945,314);
        addObject(new door2(),60,314);
        addObject(new farmer(),getWidth()/2, getHeight()/2 + 108);
    }
    
    
    public void act(){
        showText("score : " + scorecounteer.score, 140, 50);
        showText("" + monsterCount, 950, 220);
        Timer--;
        Timer2--;
        Timer3--;
        Timer4--;
        Timer5--;
        Timer6--;
        Timer7--;
        if (Timer == 0) {
            randomCloud();
            Timer = 90;
        }
         
        if (Timer2 == 0) {
           randomrainCloud();
            Timer2 = 400;
        }
       
        if (Timer4 == 0) {
        randomrainCloud2();
        Timer4 = 400;
        }
        if (Timer5 == 0) {
            randomMonsterLeft();
            Timer5 = 400;
        }
        if (Timer6 == 0) {
        randomMonsterRight();
             Timer6 = 400;
        }
        if (Timer7 == 0) {
        randomPlus();
        Timer7 = 600;
        }
    }
    
    public void randomCloud(){
        int x= Greenfoot.getRandomNumber(3);
        int y= Greenfoot.getRandomNumber(110);
        addObject(new clouds(pic[x]), 0, y);
        
    }
     int y= 0;
    
  
     int every = 0;
     int realnum = 0;
    public void randomrainCloud(){
        every= Greenfoot.getRandomNumber(900);
     
               addObject(new oops(), 50 + every, 70); 
            
            //addObject(new raincloud(),50 + every, 1);

       
     }
  
     public void randomrainCloud2(){
 
            addObject(new raincloudForNormal(),50 + every, 1);
      
     }
    static int monsterCount = 30;
     public void randomMonsterLeft(){
         if (monsterCount > 0) {
         int x= Greenfoot.getRandomNumber(4)+1;
         addObject(new monsterL("monster" + x), 70, 320);
         monsterCount--;
        }
        }
  
        public void randomMonsterRight(){
         int x= Greenfoot.getRandomNumber(4)+1;
         if (monsterCount > 0) {
         addObject(new monsterR("monster" + x), 930, 320);
         monsterCount--;
        }
        }
        public void randomPlus(){
            int x = Greenfoot.getRandomNumber(920)+ 40;
            addObject(new plus(), x, 338);
        }
}

