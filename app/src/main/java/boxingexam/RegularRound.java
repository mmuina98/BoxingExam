package boxingexam;

public class RegularRound  implements Round{

    String roundScore ="";

    RegularRound(String roundScore){
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

    public int getRedBoxerScore() {
        return 0;
    }

    public int getBlueBoxerScore() {
        return 0;
    }
}
