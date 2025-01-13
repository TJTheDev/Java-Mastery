public class SecondAndMins {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 145));
    }

    public static String getDurationString(int seconds) {
        return getDurationString((seconds / 60), (seconds % 60));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds > 59) {
            int intCleanUp = seconds / 60;
            minutes = minutes + intCleanUp;
            seconds = seconds % 60;
        }
        return (minutes / 60) + "h " + (minutes % 60) + "m " + (seconds % 60) + "s";
    }
}
