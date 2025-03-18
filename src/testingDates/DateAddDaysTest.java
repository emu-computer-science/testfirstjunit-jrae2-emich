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
        myTestDate = new Date(4,1,2025);
        myTestDayAfter = new Date(4,2,2025);
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
        assertTrue(myTestDate.addOneDay().equals(myTestDayAfter));        
    }
    
    @Test
    public void testInMonthLater() {
        assertTrue(myTestDateLater.addOneDay().equals(myTestDayAfterLater));
    }
    
    @Test
    public void testAcrossMonths() {
        assertTrue(myTestDateMonthBoundary.addOneDay().equals(myTestDayAfterMonthBoundary));
    }
    
    @Test
    public void testAcrossMonthsLater() {
        assertTrue(myTestDateMonthBoundaryLater.addOneDay().equals(myTestDayAfterMonthBoundaryLater));
    }
    
    @Test
    public void testAcrossYears() {
        assertTrue(myTestDateYearBoundary.addOneDay().equals(myTestDayAfterYearBoundary));
    }
}
