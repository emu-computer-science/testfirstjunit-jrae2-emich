package testingDates;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DateSetDateTest {
    private static Date myTestDate;
    private static Date myCompareDate;
    
    @Before
    public void prepTests() {
        myTestDate = new Date(4,1,2025);        
    }

    @Test
    public void testSetDateValid() {
        myCompareDate = new Date(7,4,2025);
        myTestDate.setDate("July",4,2025);
        assertEquals(myCompareDate, myTestDate);
    }
    
    @Test
    public void testSetDateValidPast() {
        myCompareDate = new Date(7,14,1949);
        myTestDate.setDate("July",14,1949);
        assertEquals(myCompareDate, myTestDate);
    }
    
    @Test
    public void testSetDateValidFuture() {
        myCompareDate = new Date(7,14,2026);
        myTestDate.setDate("July",14,2026);
        assertEquals(myCompareDate, myTestDate);
    }
    
    @Test
    public void testSetDateInvalid() {
        myTestDate.setDate("June",31,2025);
        myCompareDate = new Date(4,1,2025);
        assertEquals(myCompareDate,myTestDate);
    }
    
    @Test
    public void testSetDateInvalidBadMonth() {
        myTestDate.setDate("Jupiter",31,2025);
        myCompareDate = new Date(4,1,2025);
        assertEquals(myCompareDate,myTestDate);
    }

    @Test
    public void testSetDateInvalidFeb() {
        myTestDate.setDate("Feb",29,2025);
        myCompareDate = new Date(4,1,2025);
        assertEquals(myCompareDate,myTestDate);
    }
}
