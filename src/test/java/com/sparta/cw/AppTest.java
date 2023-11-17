package com.sparta.cw;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest
{
    @Test
    public void checkIsPalindromeTrue(){
        Assertions.assertEquals(true, App.isPalindrome("bob"));
        Assertions.assertEquals(true, App.isPalindrome("madam"));
        Assertions.assertEquals(true, App.isPalindrome("racecar"));
    }
    @Test
    public void checkIsPalindromeFalse(){
        Assertions.assertEquals(false, App.isPalindrome("craig"));
        Assertions.assertEquals(false, App.isPalindrome("dave"));
        Assertions.assertEquals(false, App.isPalindrome("manish"));
    }
    @Test
    public void checkStringBuilderReverseFalse(){
        Assertions.assertEquals(false, App.isPalindrome("harry"));
        Assertions.assertEquals(false, App.isPalindrome("dave"));
        Assertions.assertEquals(false, App.isPalindrome("manish"));
    }

}
