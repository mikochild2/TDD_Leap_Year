import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void isLeapYear() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.processYear(1996));
        assertEquals(false, leapYear.processYear(2001));
        assertEquals(true, leapYear.processYear(2000));
        assertEquals(false, leapYear.processYear(1900));
    }
}