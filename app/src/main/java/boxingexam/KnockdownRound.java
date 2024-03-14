package boxingexam;

public class KnockdownRound implements Round{

    String roundScore = "";

    KnockdownRound(String roundScore){
        this.roundScore = roundScore;
    }


    @Override
    public byte redBoxerScore() {
        return 0;
    }

    @Override
    public byte blueBoxerScore() {
        return 0;
    }

    @Override
    public void boxerRoundScore() {

    }

    public String getBlueBoxerScore() {
        return "";
    }

    public String getRedBoxerScore() {
        return "";
    }
}
