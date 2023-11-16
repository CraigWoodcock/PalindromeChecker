package com.sparta.cw;


public class App
{
    public static void main( String[] args ){

       String example1 = "craig" ;
       String example2 = "Is mom a palindrome";
       String example3 = "bob";

//        System.out.println(isPalindrome(example1));
//        getStringbuilderReverse(example1);
        getLongestPalindrome(example2);

    }

    public static boolean isPalindrome(String example1){


        String reversed = "";


        for (int i=example1.length()-1; i >= 0; i--) {
            reversed = reversed + example1.charAt(i);
            if (example1.equals(reversed)) {

                return true;

            }
        }return false;
    }

//    public static void getStringbuilderReverse(String example1){
//        StringBuilder sb = new StringBuilder(example1);
//        StringBuilder rev = sb.reverse();
//        System.out.println(rev);
//
//    }

    public static void getLongestPalindrome(String example2){

        String[] sentence = example2.split(" ");
        for (String word:sentence) {
            if (word.length()>2){

            System.out.println(word +" = "+ isPalindrome(word));
        }
        }

    }


}
