import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pir extends Buah
{
    /**
     * Act - do whatever the Pir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public Pir(){
        GreenfootImage img = this.getImage();
        img.scale(30, 30);
        this.setImage(img);
        this.setRotation(0);
    }
    void cetakbaru(){
        Pir pir = new Pir();
        getWorld().addObject(pir,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
