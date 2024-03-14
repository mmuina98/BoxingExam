package boxingexam;

public class RegularRound  implements Round{

    String roundScore ="";
    int blueBoxScore = 0;
    int redBoxScore = 0;

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
        if (roundScore.charAt(0) == '1'){
            this.blueBoxScore = 9;
            this.redBoxScore = 10;
        }else{

            this.blueBoxScore = 10;
            this.redBoxScore = 9;
        }
    }

    public int getRedBoxerScore() {
        return this.redBoxScore;
    }

    public int getBlueBoxerScore() {
        return this.blueBoxScore;
    }

}
