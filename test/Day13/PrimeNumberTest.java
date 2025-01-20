package Day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PrimeNumberTest {
    @Test
    public void zeroPrime()
    {
        assertEquals("Not a PrimeNumber",PrimeNumber.isPrime(0));
    }
    @Test
    public void onePrime()
    {
        assertEquals("Not a PrimeNumber",PrimeNumber.isPrime(1));
    }
    @Test
    public void notPrime()
    {
        assertEquals("Not a PrimeNumber",PrimeNumber.isPrime(4));
    }
    @Test
    public void negativePrime()
    {
        assertEquals("Not a PrimeNumber",PrimeNumber.isPrime(-4));
    }
}