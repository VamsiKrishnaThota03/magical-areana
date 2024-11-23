public class MagicalArena
{
    public static void main(String[] args)
    {
        // Create two players
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        // Start the match between the two players
        Match match = new Match(playerA, playerB);
        match.start();
    }
}