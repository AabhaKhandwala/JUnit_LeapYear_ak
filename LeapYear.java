package LeapYear;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeapYear {

    public String getYears(int[] years) {
        return Arrays.stream(years).mapToObj(this::checkLeapYear).collect(Collectors.joining(","));
    }

    public String checkLeapYear(int yr) {
        if (isDivisibleBy4(yr) && !isDivisibleBy100(yr) || isDivisibleBy400(yr)) {
            return "Leap Year";
        } else {
            return "Not a Leap Year";
        }
    }

    private boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    private boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    private boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }
}