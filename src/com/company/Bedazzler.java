package com.company;

public class Bedazzler {

    private static final String DELIMITER = "*";

    public static void main(String[] args) {
        System.out.println(bedazzle("This is my string"));
    }

    //private only accessible to this class
    //public means can be called
    //static is not associated with any particular object
    //heap memory we don't know how many times we need that
    //final means nothing can't change it (Example if we write DELIMITER = "abc", we won't be able to do it)
    //refactoring doesn't change the functionality, only the structure

    public static String bedazzle(String inputStr){
        String outputStr = "";

        for (int i = 0; i < inputStr.length(); i++) {
            outputStr += DELIMITER;

            char currentChar = inputStr.charAt(i);
            if (currentChar == ' ') {
                outputStr += " ";
            }
            else {
                outputStr += currentChar;
            }
        }

        outputStr += DELIMITER;
        return outputStr;
    }
}
