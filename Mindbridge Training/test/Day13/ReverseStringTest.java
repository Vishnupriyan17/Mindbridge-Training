package Day13;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest{
    @Test
    public void isEmpty()
    {
        assertEquals("",ReverseString.reverse(""));
    }
    @Test
    public void isNormal()
    {
        assertEquals("unhsiv",ReverseString.reverse("vishnu"));
        assertEquals("unhsiV",ReverseString.reverse("Vishnu"));
    }
    @Test
    public void isSingle()
    {
        assertEquals("v",ReverseString.reverse("v"));
        assertEquals("V",ReverseString.reverse("V"));
    }
    @Test
    public void isSpecial()
    {
        assertEquals("@v",ReverseString.reverse("v@"));
    }
}