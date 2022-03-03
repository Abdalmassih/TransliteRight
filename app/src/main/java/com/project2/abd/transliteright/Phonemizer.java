package com.project2.abd.transliteright;

import java.util.ArrayList;


public class Phonemizer {

    float[][] weights = new float[40][40];
    static ArrayList<String> srcPhonemes = new ArrayList<String>();
    static ArrayList<String> destPhonemes = new ArrayList<String>();
    String[] phoneme;
    static Rules rules = new Rules();
    static ArrayList<String> Phonemes = new ArrayList<String>();

    public Phonemizer() {

    }


    public static ArrayList<String> phonemize(String name) {

        char[] nameLetters = name.toCharArray();

        for (int i = 0; i < nameLetters.length; i++) {
            if (nameLetters.length > i + 1 && (nameLetters[i] == 'p' || nameLetters[i] == 'P') && (nameLetters[i + 1] == 'h' || nameLetters[i + 1] == 'H')) {
                Phonemes.add("ph");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'c' || nameLetters[i] == 'C') && (nameLetters[i + 1] == 'k' || nameLetters[i + 1] == 'K')) {
                Phonemes.add("ck");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'c' || nameLetters[i] == 'C') && (nameLetters[i + 1] == 'h' || nameLetters[i + 1] == 'H')) {
                Phonemes.add("ch");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'c' || nameLetters[i] == 'C') && (nameLetters[i + 1] == 'e' || nameLetters[i + 1] == 'E')) {
                Phonemes.add("ce");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'c' || nameLetters[i] == 'C') && (nameLetters[i + 1] == 'i' || nameLetters[i + 1] == 'I')) {
                Phonemes.add("ci");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'o' || nameLetters[i] == 'O') && (nameLetters[i + 1] == 'u' || nameLetters[i + 1] == 'U')) {
                Phonemes.add("ou");
                i++;

            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'e' || nameLetters[i] == 'E') && (nameLetters[i + 1] == 'i' || nameLetters[i + 1] == 'I')) {
                Phonemes.add("ei");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'i' || nameLetters[i] == 'I') && (nameLetters[i + 1] == 'e' || nameLetters[i + 1] == 'E')) {
                Phonemes.add("ie");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'g' || nameLetters[i] == 'G') && (nameLetters[i + 1] == 'h' || nameLetters[i + 1] == 'H')) {
                Phonemes.add("gh");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'k' || nameLetters[i] == 'K') && (nameLetters[i + 1] == 'h' || nameLetters[i + 1] == 'H')) {
                Phonemes.add("kh");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 's' || nameLetters[i] == 'S') && (nameLetters[i + 1] == 'h' || nameLetters[i + 1] == 'H')) {
                Phonemes.add("sh");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'a' || nameLetters[i] == 'A') && (nameLetters[i + 1] == 'i' || nameLetters[i + 1] == 'I')) {
                Phonemes.add("ai");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 't' || nameLetters[i] == 'T') && (nameLetters[i + 1] == 'h' || nameLetters[i + 1] == 'H')) {
                Phonemes.add("th");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'd' || nameLetters[i] == 'D') && (nameLetters[i + 1] == 'h' || nameLetters[i + 1] == 'H')) {
                Phonemes.add("dh");
                i++;
            } else if (nameLetters.length > i + 1 && (nameLetters[i] == 'e' || nameLetters[i] == 'E') && (nameLetters[i + 1] == 'y' || nameLetters[i + 1] == 'Y')) {
                Phonemes.add("ey");
                i++;
            } else if ((nameLetters.length) > i + 1 && nameLetters[i] == nameLetters[i + 1]) {
                Phonemes.add(String.valueOf(nameLetters[i]) + String.valueOf(nameLetters[i + 1]));
                i++;
            } else if ((nameLetters.length) > i + 1 && (nameLetters[i] == '-' || nameLetters[i] == '_')) {
                continue;
            } else if ((nameLetters.length) > i + 1 && nameLetters[i] == ' ') {
                continue;
            } else {
                Phonemes.add(String.valueOf(nameLetters[i]));
            }

        }

        System.out.println(Phonemes);


        return Phonemes;
    }



    public static void main(String[] args) {



    }
}
