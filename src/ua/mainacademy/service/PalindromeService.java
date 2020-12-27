package ua.mainacademy.service;

public class PalindromeService {
    private int number_1;
    private int number_2;
    private int maxPalindrome;

    public PalindromeService() {
    }

    public PalindromeService(int number_1, int number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    public int getPalindrome() {

        for (int a = number_1; a <= number_2; a++) {
            for (int b = number_1; b <= number_2; b++) {

                int x = a * b;


                StringBuffer stringBuilderReverse = new StringBuffer(Integer.toString(x)).reverse();

                if (Integer.parseInt(String.valueOf(x)) == Integer.parseInt(String.valueOf(stringBuilderReverse))) {
                    if (maxPalindrome < x) {
                        maxPalindrome = x;
                    }
                }
            }
        }
        return maxPalindrome;
    }
}

