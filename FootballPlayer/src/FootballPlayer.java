public class FootballPlayer {
    int number;
    String name;
    int minute;
    boolean inPlay;
    int numberOfGoals;

    void score() {
        numberOfGoals++;
    }

    void play(int x) {
        minute = minute + x;

    }

}
