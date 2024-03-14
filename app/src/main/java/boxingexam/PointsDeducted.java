package boxingexam;

public class PointsDeducted implements Round{

    String roundScore = "";

    PointsDeducted(String roundScore){
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

    public String getRedBoxerScore() {
        return "";
    }

    public String getBlueBoxerScore() {
        return "";
    }
}
