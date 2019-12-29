package concepts.oop.inheritance;

public class CricketPlayer extends Player {

    private boolean isWicketKeeper;
    private boolean isBatsman;
    private boolean isBowler;

    public CricketPlayer(){}

    public void swingBat() {
        System.out.println("Swings bat");
    }

    public void run() {
        System.out.println("Runs");
    }
}