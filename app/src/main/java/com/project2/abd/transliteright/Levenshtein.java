package com.project2.abd.transliteright;

import android.database.sqlite.SQLiteException;

import java.util.ArrayList;


public class Levenshtein {


    public static float calcDistance(String dest, String src, MainActivity ma) throws SQLiteException {

        ArrayList<String> srcPhonemes;
        ArrayList<String> destPhonemes;
//        float subsCost = 5;
        dest = dest.toLowerCase();
        src = src.toLowerCase();
        srcPhonemes = (ArrayList<String>) com.project2.abd.transliteright.Phonemizer2.phonemize(src).clone();
        destPhonemes = (ArrayList<String>) com.project2.abd.transliteright.Phonemizer2.phonemize(dest).clone();


        float[][] distanceArray = new float[destPhonemes.size() + 1][srcPhonemes.size() + 1];
        float ii = 0;
        float jj = 0;
        distanceArray[0][0] = 0;
        for (int i = 0; i < destPhonemes.size(); i++) {
            ii = ii + ma.getInsertionCost(destPhonemes.get(i));
            distanceArray[i + 1][0] = ii;
//            System.out.println(ii);

        }
        for (int j = 0; j < srcPhonemes.size(); j++) {
            jj = jj + ma.getInsertionCost(srcPhonemes.get(j));
            distanceArray[0][j + 1] = jj;
        }

        for (int i = 1; i <= destPhonemes.size(); i++) {
            for (int j = 1; j <= srcPhonemes.size(); j++) {

                distanceArray[i][j] = Math.min(Math.min(distanceArray[i - 1][j - 1] + ma.getSubstitutionCost(destPhonemes.get(i - 1), srcPhonemes.get(j - 1)),
                                distanceArray[i][j - 1] + ma.getInsertionCost(srcPhonemes.get(j - 1))),
                        distanceArray[i - 1][j] + ma.getInsertionCost(destPhonemes.get(i - 1)));
//                System.out.println(distanceArray[i][j]);
            }
        }

        System.out.println(distanceArray[destPhonemes.size()][srcPhonemes.size()]);
        return distanceArray[destPhonemes.size()][srcPhonemes.size()];

//        System.out.println(dest.toCharArray()[dest.length()-1]);
    }




    public static void main(String[] args) throws SQLiteException {
//        String x = "sameer";
////        System.out.println(x.toCharArray()[5]);
//        int[] arr = new int[5];
////        System.out.println(x.length());
//        for (int i = 0; i <= arr.length; i++) {
//        ArrayList<String> t = new ArrayList<String>();
//        t.add("s");
//        t.add("k");
//        System.out.println("size: " + t.size());
//        System.out.println("index0" + t.get(0));

//        calcDistance("ossama", "asmar");
    }
//    }

}
