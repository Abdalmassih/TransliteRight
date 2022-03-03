
package com.project2.abd.transliteright;

import java.util.ArrayList;

public class Mapping {
    ArrayList<String> phonemes = new ArrayList<String>();

    public ArrayList<String> getPossibleMappings(String phoneme){
        //A
        if (phoneme == "A" || phoneme == "a")
        {
            phonemes.add("ا");
            phonemes.add(null);
            phonemes.add("ع");
        }
        // B
        if (phoneme == "B" || phoneme == "b" || phoneme == "BB" || phoneme == "Bb" || phoneme == "bB" || phoneme == "bb"){
            phonemes.add("ب");

        }
        // c
        if (phoneme == "C" || phoneme == "c" || phoneme =="CC" || phoneme == "Cc" || phoneme =="cC" || phoneme == "cc"){
            phonemes.add("ك");
            phonemes.add("س");
        }
        //D
        if (phoneme == "D" || phoneme == "d" || phoneme == "DD" || phoneme == "Dd" || phoneme == "dD" || phoneme == "dd"){
            phonemes.add("د");
            phonemes.add("ض");
        }
        // E
        if (phoneme == "E" || phoneme == "e"){
            phonemes.add("ي");
            phonemes.add("ع");
            phonemes.add(null);

        }
        //F
        if (phoneme == "f" || phoneme=="F" || phoneme == "FF" || phoneme == "Ff" || phoneme == "fF" || phoneme == "ff"){
            phonemes.add("ف");
        }
        //G
        if (phoneme == "G" || phoneme == "g" || phoneme == "gg" || phoneme == "GG" || phoneme == "gG" || phoneme == "Gg"){
            phonemes.add("ج");
        }
        //H
        if (phoneme == "H" || phoneme == "h" || phoneme == "HH" || phoneme =="Hh" || phoneme == "hH" || phoneme =="hh" ){
            phonemes.add("ه");
            phonemes.add("ح");

        }
        // I
        if (phoneme == "I" || phoneme=="i"|| phoneme == "II" || phoneme == "Ii" || phoneme == "iI" || phoneme== "ii"){
            phonemes.add("ي");
            phonemes.add("اي");
        }
        //J
        if (phoneme == "J" || phoneme == "j" || phoneme == "JJ" ||phoneme == "Jj" || phoneme =="jJ" || phoneme =="jj"){
            phonemes.add("ج");
        }
        //K
        if (phoneme == "K" || phoneme== "k" || phoneme == "KK" || phoneme == "Kk" ||phoneme == "kk" || phoneme == "kK"  ){

            phonemes.add("ك");
            phonemes.add("ق");
        }
        //L
        if (phoneme == "L" || phoneme== "L" || phoneme == "LL"|| phoneme== "ll" || phoneme == "Ll" || phoneme == "lL"){
            phonemes.add("ل");
        }
        //M
        if (phoneme == "M" || phoneme == "m" || phoneme == "MM" || phoneme == "mm" || phoneme=="Mm" || phoneme == "mM"){
            phonemes.add("م");
        }
        //N
        if (phoneme == "N" || phoneme == "n" || phoneme == "NN" || phoneme == "nn" || phoneme=="Nn" || phoneme == "nN"){
            phonemes.add("ن");
        }
        //O
        if ( phoneme == "o" || phoneme == "O"){
            phonemes.add("و");
            phonemes.add("ع");
        }
        //P
        if (phoneme == "P" || phoneme == "p" || phoneme== "PP" || phoneme =="pp" || phoneme == "Pp" || phoneme=="pP"){
            phonemes.add("ب");
        }
        //Q
        if (phoneme == "Q" || phoneme == "q" || phoneme == "QQ" || phoneme == "qQ" || phoneme == "Qq" || phoneme =="qq"){
            phonemes.add("ك");
            phonemes.add("ق");
        }
        // R
        if (phoneme == "R" || phoneme == "r" || phoneme == "RR" || phoneme == "Rr" || phoneme== "rR" || phoneme== "rr"){
            phonemes.add("ر");
        }
        //S
        if (phoneme == "S" || phoneme == "s" || phoneme == "SS" || phoneme == "Ss" || phoneme =="sS" || phoneme =="ss"){
            phonemes.add("س");
            phonemes.add("ص");

        }
        //T
        if (phoneme == "T" || phoneme == "t" || phoneme == "TT" || phoneme == "Tt" || phoneme =="tT" || phoneme == "tt"){
            phonemes.add("ت");
            phonemes.add("ط");
        }
        //U
        if ( phoneme== "U" || phoneme == "u"){
            phonemes.add("و");
            phonemes.add(null);
        }
        // V
        if (phoneme == "V" || phoneme == "v" || phoneme == "Vv" || phoneme == "VV" || phoneme =="vV" || phoneme=="vv"){
            phonemes.add("ف");
        }
        //W
        if (phoneme == "W" || phoneme == "w" || phoneme == "ww" || phoneme == "WW" || phoneme == "wW" || phoneme=="Ww"){
            phonemes.add("و");
        }
        //X
        if (phoneme == "X" || phoneme == "x" || phoneme == "XX" || phoneme == "xx" || phoneme == "Xx" || phoneme =="xX" ){
            phonemes.add("اس");
        }
        //Y
        if (phoneme == "Y" || phoneme == "y" || phoneme == "YY" || phoneme == "yy" || phoneme == "Yy" || phoneme =="yY"){
            phonemes.add("ي");
        }
        //Z
        if (phoneme == "Z" || phoneme == "z" || phoneme == "ZZ" || phoneme =="zz" || phoneme == "Zz" || phoneme == "zZ"){
            phonemes.add("ز");
            phonemes.add("ذ");
            phonemes.add("ظ");
        }
        //Sh
        if (phoneme == "sh" || phoneme == "SH" || phoneme == "Sh" || phoneme=="sH"){
            phonemes.add("ش");
        }
        //Ch
        if (phoneme == "ch" || phoneme == "CH" || phoneme == "Ch" || phoneme=="cH"){
            phonemes.add("ش");
        }
        //ph
        if (phoneme == "PH" || phoneme =="Ph" || phoneme=="pH" || phoneme == "ph"){
            phonemes.add("ف");
        }
        //ck
        if (phoneme == "CK" || phoneme == "cK" || phoneme == "Ck" || phoneme == "ck") {
            phonemes.add("ك");
        }
        //dh
        if (phoneme == "dh" || phoneme == "Dh" || phoneme == "DH" || phoneme == "dH"){
            phonemes.add("ظ");
        }
        //kh
        if (phoneme == "KH" || phoneme == "kh" || phoneme == "kH" || phoneme == "Kh"){
            phonemes.add("خ");
        }
        //ci
        if (phoneme == "ci" || phoneme == "CI" || phoneme == "Ci" || phoneme== "cI"){
            phonemes.add("سي");
        }
        //ce
        if (phoneme == "ce" || phoneme == "CE" || phoneme == "cE" || phoneme == "Ce"){
            phonemes.add("س");
        }
        //ei
        if (phoneme == "EI" || phoneme == "ei" || phoneme == "Ei" || phoneme == "eI"){
            phonemes.add("ي");
        }
        // th
        if (phoneme == "th" || phoneme =="TH" || phoneme == "Th" || phoneme =="tH"){
            phonemes.add("ذ");
            phonemes.add("ث");
        }
        // ai
        if (phoneme =="ai"|| phoneme =="AI" || phoneme == "Ai" || phoneme == "aI"){
            phonemes.add("ي");
        }
        //ie
        if (phoneme == "IE" || phoneme == "Ie" || phoneme == "iE" || phoneme == "ie"){
            phonemes.add("ي");
        }
        //ou
        if (phoneme == "ou" || phoneme == "OU" || phoneme == "oU" || phoneme == "Ou"){
            phonemes.add("و");
            phonemes.add(null);
        }
        //aa
        if (phoneme == "aa" || phoneme == "AA" || phoneme == "Aa" || phoneme == "aA"){
            phonemes.add("اء");
        }
        // ee
        if (phoneme == "ee" || phoneme == "EE" || phoneme == "Ee" || phoneme == "eE"){
            phonemes.add("ي");
        }
        //gh
        if ( phoneme == "gh" || phoneme == "Gh" || phoneme=="gH" || phoneme == "GH") {
            phonemes.add("غ");
        }
        // oo or uu
        if (phoneme == "OO" || phoneme == "Oo" || phoneme == "oO" || phoneme == "oo" || phoneme == "UU" || phoneme == "uu" || phoneme == "Uu" || phoneme == "uU"){
            phonemes.add("و");
        }

        for ( int i = 0 ; i < phonemes.size() ; i ++ ){
            System.out.println(phonemes.get(i));
        }

        return phonemes;


    }

}
