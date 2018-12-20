package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {

    PalindromeCheck palindromeCheck = new PalindromeCheck();
    @Test
    public void test()
    {
        assertEquals(10,palindromeCheck.add(5,5));
    }

}