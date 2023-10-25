import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sandwich here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sandwich extends Enemies
{
    /**
     * Act - do whatever the Sandwich wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sandwich(){
        GreenfootImage img = this.getImage();
        img.scale(30, 30);
        this.setImage(img);
        this.setRotation(0);
    }
    void cetakbaru(){
        Sandwich sandwich = new Sandwich();
        getWorld().addObject(sandwich,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
