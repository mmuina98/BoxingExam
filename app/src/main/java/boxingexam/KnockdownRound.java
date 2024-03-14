package boxingexam;

public class KnockdownRound implements Round{

    String roundScore = "";

    KnockdownRound(String roundScore){
        this.roundScore = roundScore;
    }


    @Override
    public byte getRedBoxerScore() {
        return 0;
    }

    @Override
    public byte getBlueBoxerScore() {
        return 0;
    }

    @Override
    public void boxerRoundScore() {

    }

}
