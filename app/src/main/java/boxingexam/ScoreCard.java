package boxingexam;

import java.util.ArrayList;

public class ScoreCard {

    String color ="";
    String redCorner ="";
    String blueCorner ="";
    String[] judgeScoreCard;
    Round[] rounds;


    ScoreCard(String color){
        this.color = color;
    }

    public void setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public void setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    public void loadJudgeScoreCard(String[] scoreCard) {
        this.judgeScoreCard = scoreCard;
    }

    public String getRedBoxerFinalScore() {
        return "";
    }

    public String getBlueBoxerFinalScore() {
        return "";
    }



    @Override
    public String toString() {
        return
                " "+'\t'+ '\t'+ color + '\n' +
                " "+'\t'+ blueCorner + '\t' + redCorner + '\n' +
                " "+'\t'+ '\t' + /*rounds.size()*/0 + " " + "rounds" +'\n' +
                "Round"+ '\t'+ "Score"+'\t'+ "Round"+'\t'+ "Score"+'\t'+ "Round"+'\n' +
                "Score"+ '\t'+ "Total"+'\t'+ "     "+'\t'+ "Total"+'\t'+ "Score"+'\n'
                ;

    }
}
