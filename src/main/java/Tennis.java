import java.lang.reflect.Array;
import java.util.Arrays;

public class Tennis {
    private Integer[] score;
    private String[] writtenScore;

    public Tennis(){
        this.score = new Integer[] {0, 0};
        this.writtenScore = new String[] {"Love", "Fifteen", "Thirty", "Forty"};
    }

    public String getScore() {
        if (Arrays.equals(this.score, new Integer[] {3,3})) return "Deuce";
        if (Arrays.equals(this.score, new Integer[] {4,3})) return "Advantage player one";
        if (Arrays.equals(this.score, new Integer[] {3,4})) return "Advantage player two";
        if (this.score[0] == 4 || this.score[0] == 5) return "Player one wins";
        if (this.score[1] == 4 || this.score[1] == 5) return "Player two wins";
        return String.format("%s-%s", this.writtenScore[this.score[0]], this.writtenScore[this.score[1]]);
    }

    public void score(String player) {
        if (player == "player one") this.score[0]++;
        if (player == "player two") this.score[1]++;
        if (Arrays.equals(this.score, new Integer[] {4,4})) this.score = new Integer[] {3,3};
    }
}
