import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keranjang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Woman extends Actor
{
    /**
     * Act - do whatever the Keranjang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    int speed = 3;
    public Woman(){
        GreenfootImage img = this.getImage();
        img.scale(150, 150);
        this.setImage(img);
        this.setRotation(0);
    }
    
    void dimakan(){
        Counter.add(1);
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-speed, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() +speed, this.getY());
        }
        
        if(isTouching(Enemies.class)){
            Counter2.add(-1);
            dimakan();
        }
        
        if(Counter2.value==0){
            Greenfoot.delay(1);
            getWorld().removeObject(this);
        }
        
    }
}
