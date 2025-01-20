
package Day13;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FactorialTest {
    @Test
    public void zeroFact()
    {
        assertEquals(1,Factorial.factorial(0));
    }
    @Test
    public void oneFact()
    {
        assertEquals(1,Factorial.factorial(1));
    }
    @Test
    public void negativeFact()
    {
        assertEquals(0,Factorial.factorial(-8));
    }

}