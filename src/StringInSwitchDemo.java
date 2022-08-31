public class StringInSwitchDemo
{
    public static void main(String[] args) {
        String dayEnglish=args[0];
        final String s="sunday"; //constant exp.
        switch (dayEnglish){
            case "monday" : System.out.println("Pazartesi"); break;
            case "tuesday" : System.out.println("Salı"); break;
            case "wednesday" : System.out.println("Çarşamba"); break;
            case "thursday" : System.out.println("Perşembe"); break;
            case "friday" : System.out.println("Cuma"); break;
            case "saturday" : System.out.println("Cumartesi"); break;
            case s:  System.out.println("Pazar"); break;
        }

    }
}
