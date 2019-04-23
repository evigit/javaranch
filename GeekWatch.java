import java.util.*;

public class GeekWatch
{
    public static void main(String[] args)
    {
        String arg = args[0];
        // Instantiate a Date object
        Date date = new Date();
        long milliseconds = System.currentTimeMillis();
        long seconds = milliseconds / 1000L;
        int daysBetween = (int)seconds / 60 / 60 / 24;

        switch( arg )
        {
            case "1":
                System.out.println("milliseconds since January 1, 1970: " + milliseconds );
                break;
            case "2":
                System.out.println("seconds since January 1, 1970: " + seconds );
                break;
            case "3":
                System.out.println("days since January 1, 1970: " + daysBetween );
                break;
            case "4":
                System.out.println( "Current date/time: "+ date.toString() );
                break;
            default:
                System.out.println("Error:  You mush choose an option from 1 to 4!");
                break;
        }
    }
}