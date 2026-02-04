public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        calculatedScore(gameOver, score, levelCompleted, bonus);
    }


    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }

        return finalScore;

    }
}
