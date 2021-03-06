import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HellWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HellWorld extends World
{
    int timeCountBlood = 0;
    
    int Timer5 = 400;
    int Timer6 = 600;
    int Timer7 = 600;
    int countDS = 0;
    /**
     * Constructor for objects of class HellWorld.
     * 
     */
    public HellWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        
       
        prepare();
        addObject(new door(),945,314);
        addObject(new door2(),60,314);
        carater carater = new carater();
        addObject(carater,getWidth()/2,303);
    }

    
    public void randomBlood(){
        
        
        if (timeCountBlood % 12 == 0){
            
            
                if(Greenfoot.getRandomNumber(10) < 3){
                    addObject(new blood(), Greenfoot.getRandomNumber(100)*10, 10);
                }
            
        
        }
        
    }
    
    
    public void act(){
        countDS++;
        timeCountBlood++;
         randomBlood();
        
          Timer5--;
        Timer6--;
        Timer7--;
         if (Timer5 == 0) {
            randomMonsterLeft();
            Timer5 = 400;
        }
        if (Timer6 == 0) {
        randomMonsterRight();
             Timer6 = 600;
        }
        
        if(countDS%300 == 0 ){
            if(Greenfoot.getRandomNumber(10)==5){
            addObject(new DS(), Greenfoot.getRandomNumber(10)*100, 0);
        }
        countDS =0;
        }
        if (Timer7 == 0) {
        randomPlus();
        Timer7 = 600;
        }
    }
    
    static int monsterCount = 40;
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
    
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        scorebbHell scorebbhell = new scorebbHell();
        addObject(scorebbhell,962,194);

        scorebbhell.setLocation(953,207);
        playHell playhell = new playHell();
        addObject(playhell,990,386);

        exit exit = new exit();
        addObject(exit,991,387);

        exit.setLocation(981,381);
        playhell.setLocation(943,380);

        

        heart heart = new heart();
        addObject(heart,52,54);
        heart.setLocation(44,54);
        heart.setLocation(49,54);
        seedpack seedpack = new seedpack();
        addObject(seedpack,956,59);
    }
    public void randomPlus(){
            int x = Greenfoot.getRandomNumber(920)+ 40;
            addObject(new plus(), x, 338);
        }
}
