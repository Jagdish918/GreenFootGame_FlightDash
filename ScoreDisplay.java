import greenfoot.*;  

public class ScoreDisplay extends Actor
{
    public int integerScore; 
    
    
    public ScoreDisplay()
    {
        setToValue(0);
        updateScore();
    }

    
    private void setToValue(int num)
    {
        integerScore = num;
        updateScore();
    }

    
    public void add(int num)
    {
        integerScore += num;
        updateScore();
    }

    
    private void updateScore()
    {

        GreenfootImage text = new GreenfootImage(""+integerScore, 60, Color.WHITE, new Color(0, 0, 0, 0));
        
        setImage(text);
    }
}
