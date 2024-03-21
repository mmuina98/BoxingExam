package boxingexam;

public class RoundFactory {
    public static Round getRound(String score) {
        return switch (score.trim()) {
            case "9 - 10", "10 - 9" -> new RegularRound(score);
            case "10 - 8", "8 - 10" -> new KnockdownRound(score);
            case "10 - 8 ,1", "1, 8 - 10" -> new PointsDeducted(score);
            default -> null;
        };
    }
}
