package boxingexam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScoreCard {

    String color ="";
    String redCorner ="";
    String blueCorner ="";
    String[] judgeScoreCard = {};
    Round[] rounds = {};


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
        this.rounds = new Round[scoreCard.length];
        int i = 0;
        for( String score : scoreCard){
            this.rounds[i] = RoundFactory.getRound(score);
            i++;
        }
    }

    public String getRedBoxerFinalScore() {
        return "";
    }

    public String getBlueBoxerFinalScore() {
        return "";
    }

    private String addAllRoundsToString(){
        StringBuilder roundsToString = new StringBuilder();
        for(Round round : rounds){
            roundsToString.append(Byte.toString(round.getRedBoxerScore())).
                    append("     ").append('\t').

                    append("     ").append('\t').
                    append("     ").append('\t').
                    append("     ").append('\t').
                    append(Byte.toString(round.getBlueBoxerScore())).
                    append("     ").append('\n');
        }
        return roundsToString.toString();
    }



    @Override
    public String toString() {
        return
                " "+'\t'+ '\t'+ color + '\n' +
                " "+'\t'+ blueCorner + '\t' + redCorner + '\n' +
                " "+'\t'+ '\t' + 0 + " " + "rounds" +'\n' +
                "Round"+ '\t'+ "Score"+'\t'+ "Round"+'\t'+ "Score"+'\t'+ "Round"+'\n' +
                "Score"+ '\t'+ "Total"+'\t'+ "     "+'\t'+ "Total"+'\t'+ "Score"+'\n'+
                this.addAllRoundsToString();
    }
}
