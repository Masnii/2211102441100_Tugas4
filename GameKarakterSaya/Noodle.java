import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Noodle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Noodle extends Enemies
{
    /**
     * Act - do whatever the Noodle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Noodle(){
        GreenfootImage img = this.getImage();
        img.scale(30, 30);
        this.setImage(img);
        this.setRotation(0);
    }
    void cetakbaru(){
        Noodle noodle = new Noodle();
        getWorld().addObject(noodle,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
