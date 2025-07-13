import java.util.Random;

public class Dice {
    private int faceUp;
    
    public Dice(){

    }

    public void rollDice(){
        Random rand = new Random();

        faceUp = rand.nextInt(6)+1;
    }
    public int getFaceUp(){
        return faceUp;
    }
}
