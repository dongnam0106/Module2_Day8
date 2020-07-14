package tennisgame;

public class TennisGame {

    private static int scoreOfPlayer1, scoreOfPlayer2;
    private static int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
    private static String score = "";
    private static int tempScore = 0;
    private static String show = "";

    private static String getAdvantage() {
        return "Advantage ";
    }

    private static String getWin() {
        return "Win for ";
    }

    private static String getScoreThan4() {
        if (minusResult == 1) {
            return score = getAdvantage() + "player1";
        } else if (minusResult == -1) {
            return score = getAdvantage() + "player2";
        } else if (minusResult >= 2) {
            return score = getWin() + "player1";
        } else {
            return score = getWin() + "player2";
        }
    }

    private static String getScorePoor4() {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfPlayer1;
            else {
                score += "-";
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case 0:
                    show = "Love";
                    break;
                case 1:
                    show = "Fifteen";
                    break;
                case 2:
                    show = "Thirty";
                    break;
                case 3:
                    show = "Forty";
                    break;
            }
        }
        return score + show;
    }

    public static int getScoreOfPlayer1() {
        return scoreOfPlayer1;
    }

    public static void setScoreOfPlayer1(int scoreOfPlayer1) {
        TennisGame.scoreOfPlayer1 = scoreOfPlayer1;
    }

    public static int getScoreOfPlayer2() {
        return scoreOfPlayer2;
    }

    public static void setScoreOfPlayer2(int scoreOfPlayer2) {
        TennisGame.scoreOfPlayer2 = scoreOfPlayer2;
    }

    public static String getScore(String nameOfPlayer1, String nameOfPlayer2, int scoreOfPlayer1, int scoreOfPlayer2) {

        if (scoreOfPlayer1 == scoreOfPlayer2) {
            switch (scoreOfPlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            getScoreThan4();
        } else {
            getScorePoor4();
        }
        return score;
    }
}
