import greenfoot.*;  


public class farmerEasy extends Actor
{
   
    
    private boolean dokeydown;

    private static int speed = 100;
    private boolean dospacedown;
    private boolean dospacedown2;
    GreenfootImage i1 = new GreenfootImage("farmer1.png");
    GreenfootImage i2 = new GreenfootImage("farmer2.png");
    String[] nameSeed = {"seed1","seed3", "seed4"};
    
    public int seedInbag = 20;
    int time = 500;
     int power = 200;
   
    public void act() {
        
        touchblackrainNormal ();
         if (isTouching(monsterL.class) ) {
            power = power - 1;
        }
        if ( isTouching(monsterR.class)) {
            power = power - 1;
        }
        if (power <1) {
            
            Greenfoot.setWorld(new scoreWorld());
            Greenfoot.playSound("Mario Death Sound Effect.wav");
        }
        if (power > 0 && easyWorld.monsterCount < 1) {
            Greenfoot.setWorld(new winWorld());
            Greenfoot.playSound("Win.wav");
        }
        if (power > 0 && normalWorld.monsterCount < 1) {
            Greenfoot.setWorld(new winWorld());
            Greenfoot.playSound("Win.wav");
        }
        if (power > 0 && hardWorld.monsterCount < 1) {
            Greenfoot.setWorld(new winWorld());
            Greenfoot.playSound("Win.wav");
        }
        
        getWorld().showText("" + seedInbag, 950, 65);
        getWorld().showText("" + power, 50, 50);
        if (seedInbag >=1) {
        if (!dokeydown) {
       if (Greenfoot.isKeyDown("space")) {
          shoot();
          dokeydown = true;
          seedInbag--;
          Greenfoot.playSound("clock ticking.wav");
        }
        
      }else if (!Greenfoot.isKeyDown("space")) {
            dokeydown = false;
        }
        
    }
    
       if (Greenfoot.isKeyDown("right")) {
          switchImage();
           
           if (getX() <= 930){
            move(4);
            }
           
           
        }
        if (Greenfoot.isKeyDown("left")) {
           switchImage();
           if (getX() >= 100){
           move(-4);
        }
        }
        
  }
  
  public void touchblackrainNormal (){
      if (isTouching(blackrainNormal.class)) {
          power = power - 1;
          
        }
    }
  
  public void switchImage()
    {
        if (getImage() == i1) 
        {
            setImage(i2);
        }
        else
        {
            setImage(i1);
        }
    }
  
    public void shoot(){
    
            int p = Greenfoot.getRandomNumber(3);
            getWorld().addObject(new seedsEasy(nameSeed[p]), getX(), getY()+30);
     
       }
    
}

    
    
    
    

