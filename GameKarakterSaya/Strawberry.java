import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Buah
{
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Strawberry(){
        GreenfootImage img = this.getImage();
        img.scale(30, 30);
        this.setImage(img);
        this.setRotation(0);
    }
    void cetakbaru(){
        Strawberry strawberry = new Strawberry();
        getWorld().addObject(strawberry,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
