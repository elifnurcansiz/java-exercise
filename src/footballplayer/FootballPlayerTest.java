package footballplayer;

public class FootballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer elifnur = new FootballPlayer();
        elifnur.name = "elifnur Cansiz";
        elifnur.number = 1;
        elifnur.minute = 0;
        elifnur.inPlay = true;
        elifnur.numberOfGoals = 0;
        System.out.println("Number of goals score : " + elifnur.numberOfGoals);
        System.out.println("elifnur played minutes " + elifnur.minute);
        elifnur.score();
        System.out.println("Number of goals score : " + elifnur.numberOfGoals);
        elifnur.score();
        System.out.println("Number of goals score : " + elifnur.numberOfGoals);
        elifnur.play(55);
        System.out.println("elifnur played minute : " + elifnur.minute);
        
    }
}

