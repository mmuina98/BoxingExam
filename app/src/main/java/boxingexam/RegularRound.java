package boxingexam;

public class RegularRound  implements Round{

    String roundScore ="";
    byte blueBoxScore = 0;
    byte redBoxScore = 0;

    RegularRound(String roundScore){
        this.roundScore = roundScore;
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return blueBoxScore;
    }

    @Override
    public void boxerRoundScore() {
        if (roundScore.charAt(0) == '1') {
            this.blueBoxScore = 9;
            this.redBoxScore = 10;
        } else {

            this.blueBoxScore = 10;
            this.redBoxScore = 9;
        }

    }

}
