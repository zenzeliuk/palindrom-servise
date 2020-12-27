package ua.mainacademy.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {

    @Test
    void getPalindrome() {
        PalindromeService p = new PalindromeService(100, 999);

        StringBuffer a = new StringBuffer(Integer.toString(p.getPalindrome()));
        a.reverse();

        assertEquals(Integer.parseInt(String.valueOf(a)), p.getPalindrome());
    }
}