package com.company;

public class Bedazzler {

    public static void main(String[] args) {
        System.out.println(bedazzle("This is my string"));
    }

    //public means can be called
    //static is not associated with any particular object
    //heap memory we don't know how many times we need that
    public static String bedazzle(String inputStr){
        String outputStr = "";

        for (int i = 0; i < inputStr.length(); i++) {
            outputStr += "*";

            char currentChar = inputStr.charAt(i);
            if (currentChar == ' '){
                outputStr += " ";
            }
            else{
                outputStr += currentChar;
            }
        }

        outputStr += "*";
        return outputStr;
    }
}
