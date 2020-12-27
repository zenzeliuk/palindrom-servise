package ua.mainacademy;

import ua.mainacademy.service.PalindromeService;

import java.util.logging.Logger;

public class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        PalindromeService palindromeService = new PalindromeService(1000,9999);

        LOGGER.info("Max palindrome " + palindromeService.getPalindrome());

    }
}
