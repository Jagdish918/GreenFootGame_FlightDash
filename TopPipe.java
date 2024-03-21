import greenfoot.*;  


public class TopPipe extends Actor
{
    private GreenfootImage imgTop;
    
    private boolean isInitialized = false; 
    private int pos; 
  
    public TopPipe(int location)
    {
        imgTop = new GreenfootImage(80, location - 50); 
        pos = location;
    }
    
    
    public void act() 
    {
        if(!isInitialized)  
        {
            setLocation(500, pos - 100 - (imgTop.getHeight() / 2));
            isInitialized = true;
        }
        
        if(getX() <= 1) 
        {
            getWorld().removeObject(this);
        }
        
        move(-5);
    }
}
