package boxingexam;

public class RegularRound  implements Round{

    private String roundScore ="";
    private byte blueBoxScore = 0;
    private byte redBoxScore = 0;
    private byte blueTotalScore = 0;
    private byte redTotalScore = 0;

    RegularRound(String roundScore){
        this.roundScore = roundScore;
        this.boxerRoundScore();
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

    @Override
    public String toString() {
        return Byte.toString(redBoxScore) +
        "     " + '\t' +

        "     " + '\t' +

        "     " + '\t' +

        "     " + '\t' +
        Byte.toString(blueBoxScore) +
        "     " + '\n' ;
    }
}
