public class Main {
    public static void main(String[] args) {
        String player1Name = "Tim";
        String player2Name = "Raven";
        String player3Name = "TJ";
        String player4Name = "Jess";
        String player5Name = "Kevin";

        displayHighScorePosition(player4Name,calculateHighScorePosition(1500));
        displayHighScorePosition(player5Name,calculateHighScorePosition(1000));
        displayHighScorePosition(player3Name,calculateHighScorePosition(500));
        displayHighScorePosition(player2Name,calculateHighScorePosition(100));
        displayHighScorePosition(player1Name,calculateHighScorePosition(25));
    }


    public static void displayHighScorePosition (String playerName, int scoreRank) {
        System.out.println(playerName + " managed to get into position " + scoreRank + " on the high score list.");
    }

    public static int calculateHighScorePosition (int score) {

        int scoreRank;
        if (score >= 1000) {
            scoreRank = 1;
        } else if (score >= 500) {
            scoreRank = 2;
        } else if (score >= 100) {
            scoreRank = 3;
        } else {
            scoreRank = 4;
        }
        return scoreRank;
    }
}
