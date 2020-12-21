import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class NextDayCalculatorTest {

    @Test
    @DisplayName("Case 1-1-2018")
    void testDay1Month1Year2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expectedResult = "2/1/2018";
        String result = (new NextDayCalculator()).nextDayCalculator(day,month,year);
        assertEquals(result,expectedResult);
    }
    @Test
    @DisplayName("Case 31/1/2018")
    public void testDay31Month1Year2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expectedResult = "1/2/2018";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(result,expectedResult);
    }
    @Test
    @DisplayName("Case 30/4/2018")
    public void testDay30Month4Year2018(){
        int day = 30;
        int month = 4;
        int year = 2018;
        String expectedResult = "1/5/2018";
        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(result,expectedResult);
    }
    @Test
    @DisplayName("Case 28/2/2018")
    void testDay28Month2Year2018(){
        int day = 28;
        int month = 2;
        int year = 2018;
        String expectedResult = "1/3/2018";
        String result = (new NextDayCalculator()).nextDayCalculator(day,month,year);
        assertEquals(expectedResult,result);
    }
    @Test
    @DisplayName("Case 29/2/2020")
    void testDay29Month2Year2020(){
        int day = 29;
        int month = 2;
        int year = 2020;
        String expectedResult = "1/3/2020";
        String result = (new NextDayCalculator()).nextDayCalculator(day,month,year);
        assertEquals(expectedResult,result);
    }
    @Test
    @DisplayName("Case 31/12/2020")
    void testDay31Month12Year2020(){
        int day = 31;
        int month = 12;
        int year = 2020;
        String expectedResult = "1/1/2021";
        String result = (new NextDayCalculator()).nextDayCalculator(day,month,year);
        assertEquals(expectedResult,result);
    }


}