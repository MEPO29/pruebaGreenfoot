import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @Mario Puente (your name) 
 * @version 1 (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        eat();
        dance();
        
    }    
    
    public void hooray()
    {
        sleep(2);
        if (isBored())
        {
            shoutHooray();
        }
    }
}
