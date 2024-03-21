import greenfoot.*;  


public class Bird extends Actor
{
    private WorldClass w;
    
    private int moveY = 5;  
                            
    private int imageNumber = 1; 

    private GreenfootImage img1; 
        public Bird()
    {
        img1 = new GreenfootImage(getImage()); 
        setImage(img1);
    }

    public void addedToWorld(World world)
    {
        w = (WorldClass) world; 
    }

    public void act() 
    {
        flapUp();

        if(isTouching(Boundary.class)) 
        {
            w.score();
            w.removeObject(getOneIntersectingObject(Boundary.class)); //Removes the invisible boundary so that it is not possible to score more than once on the same pipe.
            Greenfoot.playSound("ping.mp3");
        }

        if(isTouching(TopPipe.class) || isTouching(BottomPipe.class) || getY() >= 599)
        {
            w.lost();
            Greenfoot.playSound("death.wav");
        }
    }   

    

    private void animate()
    {
        if(Greenfoot.getRandomNumber(3) == 0)
        {
            if(imageNumber == 3)
            {
                imageNumber = 1;
            }
            else {
                imageNumber++;
            }
            setImage("flappybird"+imageNumber+".png");
        }
    }    

    
    private void flapUp()
    {
        final int jumpDist = -18;
        if(Greenfoot.mouseClicked(null))
        {
            moveY = jumpDist;                       
        }

        else if(Greenfoot.isKeyDown("space")||Greenfoot.isKeyDown("up"))
        {
            moveY = jumpDist/2; 
        }
        if(moveY != 5) 
        {
            moveY++; 
        }
        setLocation(getX(), getY() + moveY);
        animate();
    }
}
