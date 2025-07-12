public class Game {
    
    double score;
    double playerHealth;
    String playerId;
    boolean isPlayerALive;


    public Game(double score, double playerHealth, String playerId, boolean isPlayerALive){
        this.score =  score;
        this.playerHealth = playerHealth;
        this.playerId = playerId;
        this.isPlayerALive = isPlayerALive;
    }

    public double increaseScore(double currentScore){
        currentScore += 10;
        return currentScore;
    }

    public boolean isgameOver(boolean isPlayerALive){
        return isPlayerALive;
    }

    public double playerGettingHurt(double playerCurrentHealth){
        playerCurrentHealth -= 5;
        return playerCurrentHealth;
    }
}
