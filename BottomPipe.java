import greenfoot.*;  


public class BottomPipe extends Actor
{
    private GreenfootImage imgBottom;
    
    private int pos; 
           
    private boolean isInitialized = false; 
  
    public BottomPipe(int location)
    {
        imgBottom = new GreenfootImage(80, 600 - location - 50); 
        pos = location;
    }
    
   
    public void act() 
    {
        if(!isInitialized)
        {
            setLocation(500, pos + 100 + (imgBottom.getHeight() / 2));
            isInitialized = true;
        }
        
        if(getX() <= 1)
        {
            getWorld().removeObject(this);
        }
        
        move(-5);
    }    
}
