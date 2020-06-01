package LeapYear;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LeapYearTest {
    @Test
    public void inputYearToCheck() {
        LeapYear lp = new LeapYear();
        assertEquals("Leap Year", lp.getYears(new int[] { 1996 }));
        assertEquals("Leap Year,Not a Leap Year,Leap Year,Not a Leap Year",
                lp.getYears(new int[] { 1996, 2001, 2000, 1900 }));
    }

    @Test
    public void checkLeapYearInput() {
        LeapYear lp = new LeapYear();
        assertEquals("Leap Year", lp.checkLeapYear(1996));
        assertEquals("Not a Leap Year", lp.checkLeapYear(2001));
        assertEquals("Leap Year", lp.checkLeapYear(2000));
        assertEquals("Not a Leap Year", lp.checkLeapYear(1900));
    }

}