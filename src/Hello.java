

public class Hello {
//psvm - sout

    public static void main(String[] args) {
       String res = getDurationString(0, 3945L);
        System.out.println(res);

    }

    public static String getDurationString(long minutes, long seconds){
        if (minutes < 0 || (seconds <0)){
            return "invalid value";
        }

        minutes += seconds / 60;
        seconds = seconds % 60;

        long hours = minutes / 60;
        minutes = minutes % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }

}