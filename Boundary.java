import greenfoot.*;  


public class Boundary extends Actor
{
    private GreenfootImage imgBoundary;
    private boolean isPipeInitialized = false; 
    private int pos;
    public Boundary(int location)
    {
        imgBoundary = new GreenfootImage(1, 180);    
        pos = location;
        setImage(imgBoundary);
    }
 
    public void act() 
    {
        if(!isPipeInitialized)
        {
            setLocation(500, pos);
            isPipeInitialized = true;
        }
        
        move(-5);
    }    
}
