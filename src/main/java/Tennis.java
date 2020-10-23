public class Tennis {
    private String score;

    public Tennis(){
        this.score = "Love-Love";
    }

    public String getScore() {
        return this.score;
    }

    public void score(String player_one) {
        this.score = "Fifteen-Love";
    }
}
