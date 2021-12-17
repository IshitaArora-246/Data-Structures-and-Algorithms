package com.ishita;

public class Pangram {

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoveralazydog";
        System.out.println(checkIfPangram(str));
    }

    public static boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char letter : alphabet.toCharArray()) {
            if (sentence.indexOf(letter) == -1) return false;
        }
        return true;
    }
}
