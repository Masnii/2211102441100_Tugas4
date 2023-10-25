import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wortel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wortel extends Buah
{
    /**
     * Act - do whatever the Wortel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wortel(){
        GreenfootImage img = this.getImage();
        img.scale(30, 30);
        this.setImage(img);
        this.setRotation(0);
    }
    void cetakbaru(){
        Wortel wortel = new Wortel();
        getWorld().addObject(wortel,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
