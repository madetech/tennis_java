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
        return String.format("%s-%s", this.writtenScore[this.score[0]], this.writtenScore[this.score[1]]);
    }

    public void score(String player) {
        if (player == "player one") this.score[0]++;
        if (player == "player two") this.score[1]++;
    }
}
