package boxingexam;

public class PointsDeducted implements Round {

    String roundScore = "";

    PointsDeducted(String roundScore) {
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

