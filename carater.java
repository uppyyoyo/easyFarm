import greenfoot.*;  


public class carater extends HellMap
{
   
    
    private boolean dokeydown;

    private static int speed = 100;
    private boolean dospacedown;
    private boolean dospacedown2;
    GreenfootImage i1 = new GreenfootImage("farmerH1.png");
    GreenfootImage i2 = new GreenfootImage("farmerH2.png");
    String[] nameSeed = {"seedH1","seedH3", "seedH4"};
    
    public int seedInbag = 20;
    int time = 500;
    
     public static int power = 200;
     
     
     boolean bloodTouch = false;
   
     
     public static int x;
     public static int y;
     
     
     boolean touch = false;
     int inAir = 0;
     int getYon;
     
     
     int daethTime = 500;
     
     
     
    public void act() {
        x = getX();
        y = getY();
        touchblackrainNormal ();
        
        
        daethTime--;
        
        
        if (isTouching(door.class)) {
            setLocation(120, getY());
        }
        if (isTouching(door2.class)) {
            setLocation(890, getY());
        }
        
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
      
        
        getWorld().showText("" + seedInbag, 950, 65);
        getWorld().showText("" + power, 50, 50);
        if (seedInbag >=1) {
        if (!dokeydown) {
       if (Greenfoot.isKeyDown("space")) {
          shoot();
          power -= Greenfoot.getRandomNumber(15);
          dokeydown = true;
          seedInbag--;
          Greenfoot.playSound("clock ticking.wav");
        }
        
      }else if (!Greenfoot.isKeyDown("space")) {
            dokeydown = false;
        }
        
    }
    if (Greenfoot.isKeyDown("up")&&!touch&& inAir == 0){
        touch = true;
        getYon = getY();
        
    }else if(touch&& inAir < 35){
        inAir++;
        setLocation(getX(), getY()-4);
    }else if(touch && getY() < getYon){
        
        setLocation(getX(), getY()+4);
    }else if(!Greenfoot.isKeyDown("up")&& touch && getY() >= getYon){
        inAir = 0;
        touch = false;
        
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
        
        
        if(isTouching(blood.class)&&!bloodTouch){
            power -= 10;
            bloodTouch = true;
        }
        else if(!isTouching(blood.class)&&bloodTouch){
         
            bloodTouch = false;
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
            getWorld().addObject(new seedHell(nameSeed[p]), getX(), getY()+30);
     
       }
    
}

    
    
    
    

