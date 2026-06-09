/*In here used JUnit 4 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {

    private Calculator calculator; 
    
    @Before
    public void setup(){ 
        calculator = new Calculator(); 
    }

    @Test 
    public void testAdd(){
        Calculator cal=new Calculator();
        assertEquals(8, cal.add(3,5));
    }

    @Test 
    public void testAdd2(){
        assertEquals(8, calculator.add(3,5));
    }


    @Test 
    public void testDivision1() { 
        Calculator cal=new Calculator();
        double result = cal.divide(10,2); 
        assertEquals(5.0, result, "10/2 should equal 5.0"); 
    }

    @Test 
    public void testDivision2() { 
        double result = calculator.divide(10,2); 
        assertEquals(5.0, result, "10/2 should equal 5.0"); 
    }

    @Test
    public void testDivision_ByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}
