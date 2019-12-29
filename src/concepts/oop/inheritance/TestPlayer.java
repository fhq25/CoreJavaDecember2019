package concepts.oop.inheritance;

public class TestPlayer {

    public static void main(String[] args) {

        BasketballPlayer lebronJames = new BasketballPlayer();
        CricketPlayer sachinT = new CricketPlayer();
        SoccerPlayer messi = new SoccerPlayer();

        lebronJames.startGame();
        lebronJames.score();
        lebronJames.dribble();
        System.out.println(lebronJames.jerseyNumber);
    }
}
