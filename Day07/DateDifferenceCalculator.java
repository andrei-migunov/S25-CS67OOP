import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifferenceCalculator {

    public static long daysBetweenDates(String date1, String date2) {
        // Parsing the input dates in YYYY-MM-DD format
        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);
        
        // Calculate the number of days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        
        return Math.abs(daysBetween); // Return the absolute value to avoid negative differences
    }

    public static void main(String[] args) {
        String startDate = "2023-09-17";
        String endDate = "2024-09-17";

        long days = daysBetweenDates(startDate, endDate);
        System.out.println("Days between " + startDate + " and " + endDate + ": " + days + " days");
    }
}