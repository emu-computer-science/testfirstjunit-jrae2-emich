package testingDates;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class DateAddDaysTest {
    private static Date myTestDate;
    private static Date myTestDayAfter;
    private static Date myTestDateLater;
    private static Date myTestDayAfterLater;
    private static Date myTestDateMonthBoundary;
    private static Date myTestDayAfterMonthBoundary;
    private static Date myTestDateMonthBoundaryLater;
    private static Date myTestDayAfterMonthBoundaryLater;
    private static Date myTestDateYearBoundary;
    private static Date myTestDayAfterYearBoundary;

    @Before
    public void prepDates() {
        myTestDate = new Date("April",1,2025);
        myTestDayAfter = new Date("April",2,2025);
        myTestDateLater = new Date("November",29,2025);
        myTestDayAfterLater = new Date("November",30,2025);
        myTestDateMonthBoundary = new Date("April",30,2025);
        myTestDayAfterMonthBoundary = new Date("May",1,2025);
        myTestDateMonthBoundaryLater = new Date("October",31,2025);
        myTestDayAfterMonthBoundaryLater = new Date("November",1,2025);
        myTestDateYearBoundary = new Date("December",31,2025);
        myTestDayAfterYearBoundary = new Date("January",1,2026);
        
    }
    
    @Test
    public void testInMonth() {
        assertEquals("Testing adding a day in the same month", myTestDayAfter, myTestDate.addOneDay());
    }
    
    @Test
    public void testInMonthLater() {
        assertEquals("Testing adding a day later in the same month", myTestDayAfterLater, myTestDateLater.addOneDay());
    }
    
    @Test
    public void testAcrossMonths() {
        assertEquals("Testing adding a day in the across months", myTestDayAfterMonthBoundary, myTestDateMonthBoundary.addOneDay());
    }
    
    @Test
    public void testAcrossMonthsLater() {
        assertEquals("Testing adding a day in the across months - second test", myTestDayAfterMonthBoundaryLater, myTestDateMonthBoundaryLater.addOneDay());
    }
    
    @Test
    public void testAcrossYears() {
        assertEquals("Testing adding a day in the across years", myTestDayAfterYearBoundary, myTestDateYearBoundary.addOneDay());
    }
}
