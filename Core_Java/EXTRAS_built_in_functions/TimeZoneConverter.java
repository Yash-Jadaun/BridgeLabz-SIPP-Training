package EXTRAS_built_in_functions;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneConverter {
    public static void main(String[] args) {
        ZonedDateTime currentUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Current UTC Time: " + currentUTC);

        ZonedDateTime currentGMT = currentUTC.withZoneSameInstant(ZoneId.of("GMT"));
        System.out.println("Current GMT Time: " + currentGMT);

        ZonedDateTime currentIST = currentUTC.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current IST Time: " + currentIST);
    }
}