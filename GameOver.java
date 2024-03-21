import greenfoot.*;


/**
 * This is the Game Over screen displayed when the uses loses the game. 
 * 
 * @author Achyudh, Shantanu
 * @version 14/08/2015
 */
public class GameOver extends Actor
{        
    public GameOver(int score)
    {
        GreenfootImage img = new GreenfootImage("go.jpg");
                
        GreenfootImage text1 = new GreenfootImage("Press ENTER to try again!", 30, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage text2 = new GreenfootImage("SCORE: "+score, 60, Color.WHITE, new Color(0, 0, 0, 0));
        
        img.drawImage(text1, 250 - (text1.getWidth() / 2), 540);
        img.drawImage(text2, 250 - (text2.getWidth() / 2), 350);
        
        setImage(img);
    }

    
    /**
     * Resets the world upon pressing Enter to start a new game.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new WorldClass());
        }
    }    
}
