package ru.stqa.pft.sandbox;

import org.junit.jupiter.api.Test;

public class PrimeTests {

    @Test

    public void testPrimes() {

        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }


    @Test

    public void testPrimeLong() {
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrime(n));
    }

}
