import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String rs;
        String[] array = s.split(":");
        String hh = array[0];
        int hours = Integer.parseInt(hh);

        if (s.indexOf("AM") > 0)
            hh = hours == 12 ? "00" : String.format("%02d", hours);

        else if (s.indexOf("PM") > 0) {
            hours += 12;
            hh = hours == 24 ? "12" : String.format("%02d", hours);
        }

        array[0] = hh;
        rs = String.join(":", array);
        rs = rs.replace("AM", "").replace("PM", "");

        return rs;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = "12:40:22AM";

        String result = timeConversion(s);

        System.out.println(result);

    }
}
