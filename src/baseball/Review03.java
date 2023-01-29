package baseball;

public class Review03 {
    public static void main(String[] args) {
      BaseBallTeam tokyo = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
      BaseBallTeam yokohama = new BaseBallTeam("横浜DeNAベイスターズ", 77, 63, 4);
      BaseBallTeam hanshin = new BaseBallTeam("阪神タイガース", 68, 72, 2);
      BaseBallTeam hiroshima = new BaseBallTeam("広島東洋カープ", 71, 69, 2);
      BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ", 76, 64, 2);
      BaseBallTeam chunichi = new BaseBallTeam("中日ドラゴンズ", 65, 75, 4);

      tokyo.report();
      yokohama.report();
      hanshin.report();
      hiroshima.report();
      yomiuri.report();
      chunichi.report();
    }
  }


