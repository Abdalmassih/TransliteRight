package com.project2.abd.transliteright;



        import java.util.ArrayList;
//        import org.w3c.dom.NameList;

public class Rules {

    static  Mapping mapping =new Mapping();


    public Rules() {
    }

    //Rule 1
    public static String[] Rule1(String[] name) {

        for (int i = 0; i < name.length; i++) {

            if (name[i].charAt(0) == 'B' || name[i].charAt(0) == 'b') {
                name[i] = "ب";
            }
            if (name[i].charAt(0) == 'J' || name[i].charAt(0) == 'j') {
                name[i] = "ج";
            }
            if (name[i].charAt(0) == 'F' || name[i].charAt(0) == 'f') {
                name[i] = "ف";
            }
            if (name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i') {
                name[i] = "ي";
            }
            if (name[i].charAt(0) == 'L' || name[i].charAt(0) == 'l') {
                name[i] = "ل";
            }
            if (name[i].charAt(0) == 'M' || name[i].charAt(0) == 'm') {
                name[i] = "م";
            }
            if (name[i].charAt(0) == 'N' || name[i].charAt(0) == 'n') {
                name[i] = "ن";
            }
            if (name[i].charAt(0) == 'P' || name[i].charAt(0) == 'p') {
                name[i] = "ب";
            }
            if (name[i].charAt(0) == 'R' || name[i].charAt(0) == 'r') {
                name[i] = "ر";
            }
            if (name[i].charAt(0) == 'V' || name[i].charAt(0) == 'v') {
                name[i] = "ف";
            }
            if (name[i].charAt(0) == 'X' || name[i].charAt(0) == 'x') {
                name[i] = "س";
            }
            if (name[i].charAt(0) == 'Z' || name[i].charAt(0) == 'z') {
                name[i] = "ز";

            }
            if (name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'I') {
                name[i] = "ي";
            }
            if (name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o') {
                name[i] = "و";
            }
            if (name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o') {
                if (name[i].charAt(1) == 'u' || name[i].charAt(1) == 'U') {
                    name[i] = "و";
                }
            }
            if (name[i].charAt(0) == 'W' || name[i].charAt(0) == 'w') {
                name[i] = "و";
            }
            if (name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') {
                name[i] = "ج";
            }


        }

        return name;
    }

    // Rule 2
    public static String[] Rule2(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[name.length - 2].charAt(0) == 'o' || name[name.length - 2].charAt(0) == 'O' && name[name.length - 1].charAt(0) == 'e' || name[name.length - 1].charAt(0) == 'E') {
                name[name.length - 2] = "و";
                name[name.length - 1] = " ";

            }
        }
        return name;
    }

    //Rule 3
    public static String[] Rule3(String[] name) {
        for (int i = 0; i < name.length; i++) {
            //B
            if ((name[i].charAt(0) == 'b' || name[i].charAt(0) == 'B') && (name[i + 2].charAt(0) == 'b' || name[i + 2].charAt(0) == 'B')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'b' || name[i].charAt(0) == 'B') && (name[i + 2].charAt(0) == 'b' || name[i + 2].charAt(0) == 'B')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'b' || name[i].charAt(0) == 'B') && (name[i + 2].charAt(0) == 'b' || name[i + 2].charAt(0) == 'B')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'b' || name[i].charAt(0) == 'B') && (name[i + 2].charAt(0) == 'b' || name[i + 2].charAt(0) == 'B')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //F
            if ((name[i].charAt(0) == 'f' || name[i].charAt(0) == 'F') && (name[i + 2].charAt(0) == 'f' || name[i + 2].charAt(0) == 'F')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'f' || name[i].charAt(0) == 'F') && (name[i + 2].charAt(0) == 'f' || name[i + 2].charAt(0) == 'F')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'f' || name[i].charAt(0) == 'F') && (name[i + 2].charAt(0) == 'f' || name[i + 2].charAt(0) == 'F')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'f' || name[i].charAt(0) == 'F') && (name[i + 2].charAt(0) == 'f' || name[i + 2].charAt(0) == 'F')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //G
            if ((name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') && (name[i + 2].charAt(0) == 'g' || name[i + 2].charAt(0) == 'G')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') && (name[i + 2].charAt(0) == 'g' || name[i + 2].charAt(0) == 'G')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') && (name[i + 2].charAt(0) == 'g' || name[i + 2].charAt(0) == 'G')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') && (name[i + 2].charAt(0) == 'g' || name[i + 2].charAt(0) == 'G')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //J
            if ((name[i].charAt(0) == 'j' || name[i].charAt(0) == 'J') && (name[i + 2].charAt(0) == 'j' || name[i + 2].charAt(0) == 'J')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'j' || name[i].charAt(0) == 'J') && (name[i + 2].charAt(0) == 'j' || name[i + 2].charAt(0) == 'J')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'j' || name[i].charAt(0) == 'J') && (name[i + 2].charAt(0) == 'j' || name[i + 2].charAt(0) == 'J')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
                if ((name[i].charAt(0) == 'j' || name[i].charAt(0) == 'J') && (name[i + 2].charAt(0) == 'j' || name[i + 2].charAt(0) == 'J')) {
                    if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                        name[i + 1] = "و";
                    }

                }
            }
            // L
            if ((name[i].charAt(0) == 'l' || name[i].charAt(0) == 'L') && (name[i + 2].charAt(0) == 'l' || name[i + 2].charAt(0) == 'L')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'l' || name[i].charAt(0) == 'L') && (name[i + 2].charAt(0) == 'l' || name[i + 2].charAt(0) == 'L')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'l' || name[i].charAt(0) == 'L') && (name[i + 2].charAt(0) == 'l' || name[i + 2].charAt(0) == 'L')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
                if ((name[i].charAt(0) == 'l' || name[i].charAt(0) == 'L') && (name[i + 2].charAt(0) == 'l' || name[i + 2].charAt(0) == 'L')) {
                    if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                        name[i + 1] = "و";
                    }

                }
            }
            //M
            if ((name[i].charAt(0) == 'm' || name[i].charAt(0) == 'M') && (name[i + 2].charAt(0) == 'm' || name[i + 2].charAt(0) == 'M')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'm' || name[i].charAt(0) == 'M') && (name[i + 2].charAt(0) == 'm' || name[i + 2].charAt(0) == 'M')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'm' || name[i].charAt(0) == 'M') && (name[i + 2].charAt(0) == 'm' || name[i + 2].charAt(0) == 'M')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'm' || name[i].charAt(0) == 'M') && (name[i + 2].charAt(0) == 'm' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //N
            if ((name[i].charAt(0) == 'n' || name[i].charAt(0) == 'N') && (name[i + 2].charAt(0) == 'n' || name[i + 2].charAt(0) == 'N')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'n' || name[i].charAt(0) == 'N') && (name[i + 2].charAt(0) == 'n' || name[i + 2].charAt(0) == 'N')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'n' || name[i].charAt(0) == 'N') && (name[i + 2].charAt(0) == 'n' || name[i + 2].charAt(0) == 'N')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'n' || name[i].charAt(0) == 'N') && (name[i + 2].charAt(0) == 'n' || name[i + 2].charAt(0) == 'N')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //P
            if ((name[i].charAt(0) == 'p' || name[i] == "P") && (name[i + 2].charAt(0) == 'p' || name[i + 2].charAt(0) == 'P')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'p' || name[i] == "P") && (name[i + 2].charAt(0) == 'p' || name[i + 2].charAt(0) == 'P')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'p' || name[i] == "P") && (name[i + 2].charAt(0) == 'p' || name[i + 2].charAt(0) == 'P')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'p' || name[i].charAt(0) == 'P') && (name[i + 2].charAt(0) == 'p' || name[i + 2].charAt(0) == 'P')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //R
            if ((name[i].charAt(0) == 'r' || name[i].charAt(0) == 'R') && (name[i + 2].charAt(0) == 'r' || name[i + 2].charAt(0) == 'R')) {
                if (name[i + 1] == "A" || name[i + 1] == "a") {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'r' || name[i].charAt(0) == 'R') && (name[i + 2].charAt(0) == 'r' || name[i + 2].charAt(0) == 'R')) {
                if (name[i + 1] == "U" || name[i + 1] == "u") {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'r' || name[i].charAt(0) == 'R') && (name[i + 2].charAt(0) == 'r' || name[i + 2].charAt(0) == 'R')) {
                if (name[i + 1] == "E" || name[i + 1] == "e") {
                    name[i + 1] = "ي";
                }

            }
            if ((name[i].charAt(0) == 'r' || name[i].charAt(0) == 'R') && (name[i + 2].charAt(0) == 'r' || name[i + 2].charAt(0) == 'R')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //v
            if ((name[i].charAt(0) == 'v' || name[i].charAt(0) == 'V') && (name[i + 2].charAt(0) == 'v' || name[i + 2].charAt(0) == 'V')) {
                if (name[i + 1] == "A" || name[i + 1] == "a") {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'v' || name[i].charAt(0) == 'V') && (name[i + 2].charAt(0) == 'v' || name[i + 2].charAt(0) == 'V')) {
                if (name[i + 1] == "U" || name[i + 1] == "u") {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'v' || name[i].charAt(0) == 'V') && (name[i + 2].charAt(0) == 'v' || name[i + 2].charAt(0) == 'V')) {
                if (name[i + 1] == "E" || name[i + 1] == "e") {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'v' || name[i].charAt(0) == 'V') && (name[i + 2].charAt(0) == 'v' || name[i + 2].charAt(0) == 'V')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //x
            if ((name[i].charAt(0) == 'x' || name[i].charAt(0) == 'X') && (name[i + 2].charAt(0) == 'x' || name[i + 2].charAt(0) == 'X')) {
                if (name[i + 1] == "A" || name[i + 1] == "a") {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'x' || name[i].charAt(0) == 'X') && (name[i + 2].charAt(0) == 'x' || name[i + 2].charAt(0) == 'X')) {
                if (name[i + 1] == "U" || name[i + 1] == "u") {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'x' || name[i].charAt(0) == 'X') && (name[i + 2].charAt(0) == 'x' || name[i + 2].charAt(0) == 'X')) {
                if (name[i + 1] == "E" || name[i + 1] == "e") {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'x' || name[i].charAt(0) == 'X') && (name[i + 2].charAt(0) == 'x' || name[i + 2].charAt(0) == 'X')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //z
            if ((name[i].charAt(0) == 'z' || name[i].charAt(0) == 'Z') && (name[i + 2].charAt(0) == 'z' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "A" || name[i + 1] == "a") {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'z' || name[i].charAt(0) == 'Z') && (name[i + 2].charAt(0) == 'z' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "U" || name[i + 1] == "u") {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'z' || name[i].charAt(0) == 'Z') && (name[i + 2].charAt(0) == 'z' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "E" || name[i + 1] == "e") {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'z' || name[i].charAt(0) == 'Z') && (name[i + 2].charAt(0) == 'z' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
        }
        return name;
    }

    // Rule 4
    public static String[] Rule4(String[] name) {
        for (int i = 1; i < name.length; i++) {

            if (name[name.length - 2].charAt(0) != 'a' || name[name.length - 2].charAt(0) != 'A' || name[name.length - 2].charAt(0) != 'u' || name[name.length - 2].charAt(0) != 'U' || name[name.length - 2].charAt(0) != 'i' || name[name.length - 2].charAt(0) != 'I' || name[name.length - 2].charAt(0) != 'y' || name[name.length - 2].charAt(0) != 'Y'
                    || name[name.length - 2].charAt(0) != 'o' || name[name.length - 2].charAt(0) != 'O') {
                if (name[name.length - 1].charAt(0) == 'a' || name[name.length - 1].charAt(0) == 'A') {
                    name[name.length - 1] = "ا";
                } else if (name[name.length - 1].charAt(0) == 'u' || name[name.length - 1].charAt(0) == 'U' || name[name.length - 1].charAt(0) == 'O' || name[name.length - 1].charAt(0) == 'o') {
                    name[name.length - 1] = "و";
                } else if (name[name.length - 1].charAt(0) == 'I' || name[name.length - 1].charAt(0) == 'i' || name[name.length - 1].charAt(0) == 'E' || name[name.length - 1].charAt(0) == 'e' || name[name.length - 1].charAt(0) == 'Y' || name[name.length - 1].charAt(0) == 'y') {
                    name[name.length - 1] = "ي";
                }

            }
        }

        return name;
    }

    // Rule 5
    public static String[] Rule5(String[] name) {
        for (int i = 0; i < name.length - 1; i++) {
            if (name[i].charAt(0) != 'a' || name[i].charAt(0) != 'A' || name[i].charAt(0) != 'u' || name[i].charAt(0) != 'U' || name[i].charAt(0) != 'i' || name[i].charAt(0) != 'I' || name[i].charAt(0) != 'y' || name[i].charAt(0) != 'Y' || name[i].charAt(0) != 'o' || name[i].charAt(0) != 'O'
                    && name[i + 2].charAt(0) != 'a' || name[i + 2].charAt(0) != 'A' || name[i + 2].charAt(0) != 'u' || name[i + 2].charAt(0) != 'U' || name[i + 2].charAt(0) != 'i' || name[i + 2].charAt(0) != 'I' || name[i + 2].charAt(0) != 'y' || name[i + 2].charAt(0) != 'Y' || name[i + 2].charAt(0) != 'o' || name[i + 2].charAt(0) != 'O') {
                if (name[i + 1].charAt(0) == 'S' || name[i + 1].charAt(0) == 's') {
                    try {
                        if (name[i + 1].charAt(1) == 'S' || name[i + 1].charAt(1) == 's') {
                            name[i + 1] = "س";
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        return name;
    }

    // Rule 6
    public static String[] Rule6(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if ((name[name.length - 2].charAt(0) == 'a' || name[name.length - 2].charAt(0) == 'A') && (name[name.length - 1].charAt(0) == 'H' || name[name.length - 1].charAt(0) == 'h')) {
                name[name.length - 2] = "ة";
                name[name.length - 1] = null;
            }
        }
        return name;
    }

    //Rule31
    public static String[] Rule31(String[] name) {
        for (int i = 1; i < name.length; i++) {
            if (name[name.length - 1].charAt(0) == 'a' || name[name.length - 1].charAt(0) == 'A') {
                if (name[name.length - 1].charAt(1) == 'i' || name[name.length - 1].charAt(1) == 'I') {
                    name[name.length - 1] = "اي";
                }
            }
            if (name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a') {
                if (name[i].charAt(1) == 'I' || name[i].charAt(1) == 'i') {
                    name[i] = "ي";
                }
            }
        }
        return name;
    }

    // Rule 7
    public static String[] Rule7(String[] name) {
        for (int i = 0; i < name.length; i++) {
            try {
                if (name[name.length - 3].charAt(0) != 'A' || name[name.length - 3].charAt(0) != 'a' || name[name.length - 3].charAt(0) != 'U' || name[name.length - 3].charAt(0) != 'u'
                        || name[name.length - 3].charAt(0) != 'E' || name[name.length - 3].charAt(0) != 'e' || name[name.length - 3].charAt(0) != 'Y' || name[name.length - 3].charAt(0) != 'y'
                        || name[name.length - 3].charAt(0) != 'O' || name[name.length - 3].charAt(0) != 'o') {
                    /* if ((name[name.length - 2].charAt(0) == 'U' || name[name.length - 2].charAt(0) == 'u' || name[name.length - 2].charAt(0) == 'I' || name[name.length - 2].charAt(0) == 'i'
                     || name[name.length - 2].charAt(0) == 'Y' || name[name.length - 2].charAt(0) == 'y' || name[name.length - 2].charAt(0) == 'O' || name[name.length - 2].charAt(0) == 'o'
                     || name[name.length - 2].charAt(0) == 'E' || name[name.length - 2].charAt(0) == 'e') && (name[name.length - 1].charAt(0) == 'A' || name[name.length - 1].charAt(0) == 'a')) {
                     name[name.length - 1] = " ";

                     break;
                     } else */
                    if ((name[name.length - 2].charAt(0) == 'A' || name[name.length - 2].charAt(0) == 'a' || name[name.length - 2].charAt(0) == 'I' || name[name.length - 2].charAt(0) == 'i'
                            || name[name.length - 2].charAt(0) == 'Y' || name[name.length - 2].charAt(0) == 'y' || name[name.length - 2].charAt(0) == 'O' || name[name.length - 2].charAt(0) == 'o'
                            || name[name.length - 2].charAt(0) == 'E' || name[name.length - 2].charAt(0) == 'e') && (name[name.length - 1].charAt(0) == 'U' || name[name.length - 1].charAt(0) == 'u')) {
                        name[name.length - 1] = " ";
                        break;
                    } else if ((name[name.length - 2].charAt(0) == 'U' || name[name.length - 2].charAt(0) == 'u' || name[name.length - 2].charAt(0) == 'I' || name[name.length - 2].charAt(0) == 'i'
                            || name[name.length - 2].charAt(0) == 'Y' || name[name.length - 2].charAt(0) == 'y' || name[name.length - 2].charAt(0) == 'O' || name[name.length - 2].charAt(0) == 'o'
                            || name[name.length - 2].charAt(0) == 'A' || name[name.length - 2].charAt(0) == 'a') && (name[name.length - 1].charAt(0) == 'E' || name[name.length - 1].charAt(0) == 'e')) {
                        name[name.length - 1] = " ";
                        break;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }

        return name;
    }

    // Rule 8
    public static String[] Rule8(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0].charAt(0) == 'A' || name[0].charAt(0) == 'a') {
                for (int j = 1; j < name.length - 1; j++) {
                    if (name[j].charAt(0) != 'A' || name[j].charAt(0) != 'a' || name[j].charAt(0) != 'E' || name[j].charAt(0) != 'e' || name[j].charAt(0) != 'U' || name[j].charAt(0) != 'u'
                            || name[j].charAt(0) != 'Y' || name[j].charAt(0) != 'y' || name[j].charAt(0) != 'O' || name[j].charAt(0) != 'o' || name[j].charAt(0) != 'I' || name[j].charAt(0) != 'i') {
                        if (name[name.length - 1].charAt(0) == 'A' || name[name.length - 1].charAt(0) == 'a') {
                            name[name.length - 1] = " ";
                        }
                        break;
                    }
                }
                break;
            }
            if (name[0].charAt(0) == 'U' || name[0].charAt(0) == 'u') {
                for (int j = 1; j < name.length - 1; j++) {
                    if (name[j].charAt(0) != 'A' || name[j].charAt(0) != 'a' || name[j].charAt(0) != 'E' || name[j].charAt(0) != 'e' || name[j].charAt(0) != 'U' || name[j].charAt(0) != 'u'
                            || name[j].charAt(0) != 'Y' || name[j].charAt(0) != 'y' || name[j].charAt(0) != 'O' || name[j].charAt(0) != 'o' || name[j].charAt(0) != 'I' || name[j].charAt(0) != 'i') {
                        if (name[name.length - 1].charAt(0) == 'U' || name[name.length - 1].charAt(0) == 'u') {
                            name[name.length - 1] = " ";
                        }
                        break;
                    }
                }
                break;
            }
        }
        return name;
    }

    // Rule 9
    public static String[] Rule9(String[] name) {
        for (int i = 1; i < name.length - 1; i++) {
            if (name[i].charAt(0) == 'a' || name[i].charAt(0) == 'A') {
                try {
                    if (name[i].charAt(1) == 'a' || name[i].charAt(1) == 'A') {
                        name[i] = "ع";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;

    }

    //Rule 10
    public static String[] Rule10(String[] name) {
        for (int i = 1; i < name.length; i++) {

            if (name[name.length - 1].charAt(0) == 'a' || name[name.length - 1].charAt(0) == 'A') {

                if (name[name.length - 1].charAt(1) == 'a' || name[name.length - 1].charAt(1) == 'A') {
                    name[name.length - 1] = "اء";

                }
            }
        }
        return name;
    }

    // Rule 11
    public static String[] Rule11(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0] != null && name[name.length - 1] != null) {
                if ((name[i].charAt(0) == 'e' || name[i].charAt(0) == 'E') || (name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i') || (name[i].charAt(0) == 'y' || name[i].charAt(0) == 'Y')) {
                    try {
                        if ((name[i].charAt(1) == 'e' || name[i].charAt(1) == 'E') || (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') || (name[i].charAt(1) == 'y' || name[i].charAt(1) == 'Y')) {
                            name[i] = "ي";
                        }
                    } catch (Exception e) {
                        continue;
                    }
                } else if (name[i].charAt(0) == 'i' || name[i].charAt(0) == 'I') {
                    try {
                        if (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') {
                            name[i] = "ي";
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }

        return name;
    }

    //Rule 12
    public static String[] Rule12(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'a' || name[i + 1].charAt(0) == 'A')) {
                name[i + 1] = "ا";

            }
            if ((name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'u' || name[i + 1].charAt(0) == 'U')) {
                name[i + 1] = "و";

            }
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'i' || name[i + 1].charAt(0) == 'I')) {
                name[i + 1] = "ي";

            }
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'e' || name[i + 1].charAt(0) == 'E')) {
                name[i + 1] = "ي";

            }
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'y' || name[i + 1].charAt(0) == 'Y')) {
                name[i + 1] = "ي";

            }
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y')
                    && (name[i + 1].charAt(0) == 'o' || name[i + 1].charAt(0) == 'O')) {
                name[i + 1] = "و";

            }

        }
        return name;
    }

    // Rule 13
    public static String[] Rule13(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0] != null) {
                if (name[name.length - 1].charAt(0) == 'a' || name[name.length - 1].charAt(0) == 'A') {
                    name[name.length - 1] = "ا";
                } else if ((name[name.length - 1].charAt(0) == 'e' || name[name.length - 1].charAt(0) == 'E') || (name[name.length - 1].charAt(0) == 'y' || name[name.length - 1].charAt(0) == 'Y') || (name[name.length - 1].charAt(0) == 'I' || name[name.length - 1].charAt(0) == 'i')) {
                    name[name.length - 1] = "ي";
                } else if ((name[name.length - 1].charAt(0) == 'o' || name[name.length - 1].charAt(0) == 'O') || (name[name.length - 1].charAt(0) == 'u' || (name[name.length - 1].charAt(0) == 'U'))) {
                    name[name.length - 1] = "و";
                }
            }
        }

        return name;
    }

    // Rule 14
    public static String[] Rule14(String[] name) {
        for (int i = 1; i < name.length; i++) {

            if (((name[name.length - 1].charAt(0) == 'a') || (name[name.length - 1].charAt(0) == 'A')) && (name[name.length - 2].charAt(0) == 'i' || name[name.length - 2].charAt(0) == 'I')) {
                name[name.length - 1] = "ي";
                //  name[name.length - 2] = " ";

            }

        }
        return name;

    }

    // Rule 15
    public static String[] Rule15(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if ((name[name.length - 1].charAt(0) == 'N' || name[name.length - 1].charAt(0) == 'n') && (name[name.length - 2].charAt(0) == 'o' || name[name.length - 2].charAt(0) == 'O')
                    && (name[name.length - 3].charAt(0) == 'i' || name[name.length - 3].charAt(0) == 'I') && (name[name.length - 4].charAt(0) == 't' || name[name.length - 4].charAt(0) == 'T')) {
                name[name.length - 4] = "ت";
                name[name.length - 3] = "ش";
                name[name.length - 2] = "ن";
                name[name.length - 1] = " ";
                break;
            }
        }

        return name;

    }

    //Rule 16
    public static String[] Rule16(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "غ";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;
    }

    //Rule 17
    public static String[] Rule17(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'p' || name[i].charAt(0) == 'P') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "ف";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;
    }

    //Rule 18
    public static String[] Rule18(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "تش";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;
    }

    // Rule 19
    public static String[] Rule19(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 's' || name[i].charAt(0) == 'S') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "ش";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;
    }

    //Rule 20
    public static String[] Rule20(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                if (name[i].charAt(0) == 't' || name[i].charAt(0) == 'T') {
                    try {
                        if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                            name[i] = "ث";
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        return name;
    }

    //Rule 21
    public static String[] Rule21(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0] != null) {
                if (name[name.length - 2].charAt(0) == 't' || name[name.length - 2].charAt(0) == 'T') {
                    try {
                        if (name[name.length - 2].charAt(1) == 'h' || name[name.length - 2].charAt(1) == 'H') {

                            if (name[name.length - 1].charAt(0) == 'E' || name[name.length - 1].charAt(0) == 'e') {
                                name[name.length - 2] = "ذ";
                            } else if (name[name.length - 1].charAt(0) == 'o' || name[name.length - 1].charAt(0) == 'O') {
                                name[name.length - 2] = "ذ";
                            } else if (name[name.length - 1].charAt(0) == 'u' || name[name.length - 1].charAt(0) == 'U') {
                                name[name.length - 2] = "ذ";
                            }

                        }

                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        return name;
    }

    //Rule 22
    public static String[] Rule22(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'e' || name[i].charAt(0) == 'E') {
                try {
                    if (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') {
                        name[i] = "اي";
                    }
                } catch (Exception e) {
                    continue;
                }

            } else if (name[i].charAt(0) == 'i' || name[i].charAt(0) == 'I') {
                try {
                    if (name[i].charAt(1) == 'e' || name[i].charAt(1) == 'E') {
                        name[i] = "ي";
                    }
                } catch (Exception e) {
                    continue;
                }
            } else if (name[i].charAt(0) == 'a' || name[i].charAt(0) == 'A') {
                try {
                    if (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') {
                        name[i] = "ي";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        return name;
    }

    //Rule 23
    public static String[] Rule23(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if ((name[i].charAt(0) == 'o' || name[i].charAt(0) == 'O') || (name[i].charAt(0) == 'u' || name[i].charAt(0) == 'U')) {
                try {
                    if ((name[i].charAt(1) == 'o' || name[i].charAt(1) == 'O') || (name[i].charAt(1) == 'u' || name[i].charAt(1) == 'U')) {
                        name[i] = "و";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    //Rule 24
    public static String[] Rule24(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'e' || name[i].charAt(0) == 'E') {
                try {
                    if (name[i].charAt(1) == 'y' || name[i].charAt(1) == 'Y') {
                        name[i] = "إي";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    //Rule 25
    public static String[] Rule25(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                try {
                    if (name[i].charAt(1) == 'k' || name[i].charAt(1) == 'K') {
                        name[i] = "ك";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    //Rule 26
    public static String[] Rule26(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'd' || name[i].charAt(0) == 'D') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "ظ";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }
/////rule 30

    public static String[] Rule30(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[name.length - 2].charAt(0) == 'A' || name[name.length - 2].charAt(0) == 'a') {
                name[name.length - 2] = "ا";
            }
            if (name[name.length - 2].charAt(0) == 'u' || name[name.length - 2].charAt(0) == 'U') {
                name[name.length - 2] = "و";
            }
//            if (name[name.length-2].charAt(0)== 'o' || name[name.length-2].charAt(0)=='O'){
//                name[name.length-2] ="و";
//            }
//            if (name[name.length-2].charAt(0)== 'I' || name[name.length-2].charAt(0)=='i'){
//                name[name.length-2] ="ي";
//            }
//            if (name[name.length-2].charAt(0)== 'y' || name[name.length-2].charAt(0)=='Y'){
//                name[name.length-2] ="ي";
//            }
            if (name[name.length - 2].charAt(0) == 'E' || name[name.length - 2].charAt(0) == 'e') {
                name[name.length - 2] = " ";
            }

        }

        return name;
    }
    //

    //Rule 27
    public static String[] Rule27(String[] name) {
        String[] temp = new String[name.length + 1];
        for (int i = 0; i < name.length; i++) {

            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                if (name[i + 1].charAt(0) == 'Y' || name[i + 1].charAt(0) == 'y') {
                    name[i] = "س";
                }
            }
            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                try {
                    if (name[i].charAt(1) == 'e' || name[i].charAt(1) == 'E') {
                        for (int j = 0; j < name.length + 1; j++) {
                            try {
                                if (j < i) {
                                    temp[j] = name[j];
                                } else if (j == i) {
                                    temp[j] = "س";
                                    temp[j + 1] = "" + name[i].charAt(1);
                                } else if (j > i) {
                                    temp[j + 1] = name[j];
                                }
                            } catch (Exception e) {
                                break;
                            }
                        }
                        return temp;
                    }
                } catch (Exception e) {
                    continue;
                }

            }

            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                try {
                    if (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') {
                        for (int j = 0; j < name.length + 1; j++) {
                            try {
                                if (j < i) {
                                    temp[j] = name[j];
                                } else if (j == i) {
                                    temp[j] = "س";
                                    temp[j + 1] = "" + name[i].charAt(1);
                                } else if (j > i) {
                                    temp[j + 1] = name[j];
                                }
                            } catch (Exception e) {
                                break;
                            }
                        }
                        return temp;
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    // Rule 28
    public static String[] Rule28(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'k' || name[i].charAt(0) == 'K') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "خ";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    // Rule33

    public static String[] Rule33(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0].charAt(0) == 'i' || name[0].charAt(0) == 'I') {
                name[0] = "اي";
            }
        }
        return name;
    }

    public static String[] isRule(String[] name) {
        int[] indexes = new int[name.length];
        for (int i = 0; i < name.length; i++) {
            Rule14(name);
            Rule24(name);
            Rule7(name);

            Rule22(name);
            Rule33(name);

            Rule4(name);
            Rule11(name);

            Rule23(name);
            Rule2(name);
            Rule9(name);
            Rule27(name);
            Rule20(name);
            Rule21(name);
            Rule8(name);

            Rule12(name);
            Rule30(name);
            Rule15(name);
            Rule5(name);

            Rule13(name);

            Rule16(name);
            Rule17(name);
            Rule18(name);
            Rule19(name);


            Rule25(name);
            Rule26(name);
            String temp[] = Rule27(name);
            Rule28(temp);
            Rule1(name);
            modifyFnal(name);
            //  modifyFnal(result(name), name);

            //       getIndex(name);
        /*   for(int j = 0 ; j<indexes.length ;j++){
             System.out.println(indexes[j]);
             }*/
        }
        return name;
    }

    public static int [] result(String[] name) {
        return getIndex(isRule(name));
    }
    // Rule0
    public static String[] modifyFnal(String[] name){
        for(int i=0; i<name.length ;i++){
            if (name[i].charAt(0) == 'u' || name [i].charAt(0)=='U'){
                name[i] =" ";
            }
            if (name[i].charAt(0) == 'a' || name [i].charAt(0)=='A'){
                name[i] ="ا";
            }
            if (name[i].charAt(0) == 's' || name [i].charAt(0)=='S'){
                name[i] ="س";
            }
            if (name[i].charAt(0) == 'c' || name [i].charAt(0)=='C'){
                name[i] ="ك";
            }
            if (name[i].charAt(0) == 'd' || name [i].charAt(0)=='D'){
                name[i] ="د";
            }
            if (name[0].charAt(0) == 'e' || name [0].charAt(0)=='E'){
                name[0] ="ع";
            }
            else
            {
                if (name[i].charAt(0) == 'E' || name [i].charAt(0)=='e'){
                    name[i] =" ";
                }}
            if (name[i].charAt(0) == 'h' || name [i].charAt(0)=='H'){
                name[i] ="ه";
            }
            if (name[i].charAt(0) == 'i' || name [i].charAt(0)=='I'){
                name[i] ="ي";
            }
            if (name[i].charAt(0) == 'k' || name [i].charAt(0)=='K'){
                name[i] ="ك";
            }
            if (name[i].charAt(0) == 'o' || name [i].charAt(0)=='O'){
                name[i] ="ع";
            }
            else
            {
                if (name[i].charAt(0) == 'O' || name [i].charAt(0)=='o'){
                    name[i] ="و";
                }
            }
            if (name[i].charAt(0) == 'q' || name [i].charAt(0)=='Q'){
                name[i] ="ك";
            }
            if (name[i].charAt(0) == 'T' || name [i].charAt(0)=='t'){
                name[i] ="ت";
            }

            if (name[i].charAt(0) == 'z' || name [i].charAt(0)=='Z'){
                name[i] ="ز";
            }
            if (name[i].charAt(0) == 'T' || name [i].charAt(0)=='t'){
                name[i] ="ت";
            }
        }

        return name;
    }


    public static int[] getIndex(String[] name) {
        int [] indexes =  new int[name.length];
        int [] indexes2 =  new int[name.length];
//       Integer[] inTindexes = new Integer[name.length];
//               ArrayList<Integer> indexes = new ArrayList<>();
        for(int i = 0; i< name.length ; i++){
            indexes[i] = 100;
        }

        for (int i = 0; i < name.length; i++) {

            if (name[i].matches("[a-zA-Z]+") ) {

                indexes[i] = i;
                if (indexes[i] != 100 ){
                    indexes2[i] = i;
                }

            }


            System.out.println(indexes[i]);

        }


        return indexes;
    }
}





















/*
public class Rules {

    public static String[] name2 = new String[10];

    public Rules() {
    }

    //Rule 1              
    public static String[] Rule1(String[] name) {

        for (int i = 0; i < name.length; i++) {

            if (name[i].charAt(0) == 'B' || name[i].charAt(0) == 'b') {
                name[i] = "ب";
            }
            if (name[i].charAt(0) == 'J' || name[i].charAt(0) == 'j') {
                name[i] = "ج";
            }
            if (name[i].charAt(0) == 'F' || name[i].charAt(0) == 'f') {
                name[i] = "ف";
            }
            if (name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i') {
                name[i] = "ي";
            }
            if (name[i].charAt(0) == 'L' || name[i].charAt(0) == 'l') {
                name[i] = "ل";
            }
            if (name[i].charAt(0) == 'M' || name[i].charAt(0) == 'm') {
                name[i] = "م";
            }
            if (name[i].charAt(0) == 'N' || name[i].charAt(0) == 'n') {
                name[i] = "ن";
            }
            if (name[i].charAt(0) == 'P' || name[i].charAt(0) == 'p') {
                name[i] = "ب";
            }
            if (name[i].charAt(0) == 'R' || name[i].charAt(0) == 'r') {
                name[i] = "ر";
            }
            if (name[i].charAt(0) == 'V' || name[i].charAt(0) == 'v') {
                name[i] = "ف";
            }
            if (name[i].charAt(0) == 'X' || name[i].charAt(0) == 'x') {
                name[i] = "س";
            }
            if (name[i].charAt(0) == 'Z' || name[i].charAt(0) == 'z') {
                name[i] = "ز";

            }
            if (name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'I') {
                name[i] = "ي";
            }
            if (name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o') {
                name[i] = "و";
            }
            if (name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o') {
                if (name[i].charAt(1) == 'u' || name[i].charAt(1) == 'U') {
                    name[i] = "و";
                }
            }
            if (name[i].charAt(0) == 'W' || name[i].charAt(0) == 'w') {
                name[i] = "و";
            }
            if (name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') {
                name[i] = "ج";
            }

        }

        return name;
    }

    // Rule 2
    public static String[] Rule2(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[name.length - 2].charAt(0) == 'o' || name[name.length - 2].charAt(0) == 'O' && name[name.length - 1].charAt(0) == 'e' || name[name.length - 1].charAt(0) == 'E') {
                name[name.length - 2] = "و";
                name[name.length - 1] = " ";

            }
        }
        return name;
    }

    //Rule 3
    public static String[] Rule3(String[] name) {
        for (int i = 0; i < name.length; i++) {
            //B
            if ((name[i].charAt(0) == 'b' || name[i].charAt(0) == 'B') && (name[i + 2].charAt(0) == 'b' || name[i + 2].charAt(0) == 'B')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'b' || name[i].charAt(0) == 'B') && (name[i + 2].charAt(0) == 'b' || name[i + 2].charAt(0) == 'B')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'b' || name[i].charAt(0) == 'B') && (name[i + 2].charAt(0) == 'b' || name[i + 2].charAt(0) == 'B')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'b' || name[i].charAt(0) == 'B') && (name[i + 2].charAt(0) == 'b' || name[i + 2].charAt(0) == 'B')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //F
            if ((name[i].charAt(0) == 'f' || name[i].charAt(0) == 'F') && (name[i + 2].charAt(0) == 'f' || name[i + 2].charAt(0) == 'F')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'f' || name[i].charAt(0) == 'F') && (name[i + 2].charAt(0) == 'f' || name[i + 2].charAt(0) == 'F')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'f' || name[i].charAt(0) == 'F') && (name[i + 2].charAt(0) == 'f' || name[i + 2].charAt(0) == 'F')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'f' || name[i].charAt(0) == 'F') && (name[i + 2].charAt(0) == 'f' || name[i + 2].charAt(0) == 'F')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //G
            if ((name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') && (name[i + 2].charAt(0) == 'g' || name[i + 2].charAt(0) == 'G')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') && (name[i + 2].charAt(0) == 'g' || name[i + 2].charAt(0) == 'G')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') && (name[i + 2].charAt(0) == 'g' || name[i + 2].charAt(0) == 'G')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') && (name[i + 2].charAt(0) == 'g' || name[i + 2].charAt(0) == 'G')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //J
            if ((name[i].charAt(0) == 'j' || name[i].charAt(0) == 'J') && (name[i + 2].charAt(0) == 'j' || name[i + 2].charAt(0) == 'J')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'j' || name[i].charAt(0) == 'J') && (name[i + 2].charAt(0) == 'j' || name[i + 2].charAt(0) == 'J')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'j' || name[i].charAt(0) == 'J') && (name[i + 2].charAt(0) == 'j' || name[i + 2].charAt(0) == 'J')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
                if ((name[i].charAt(0) == 'j' || name[i].charAt(0) == 'J') && (name[i + 2].charAt(0) == 'j' || name[i + 2].charAt(0) == 'J')) {
                    if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                        name[i + 1] = "و";
                    }

                }
            }
            // L
            if ((name[i].charAt(0) == 'l' || name[i].charAt(0) == 'L') && (name[i + 2].charAt(0) == 'l' || name[i + 2].charAt(0) == 'L')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'l' || name[i].charAt(0) == 'L') && (name[i + 2].charAt(0) == 'l' || name[i + 2].charAt(0) == 'L')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'l' || name[i].charAt(0) == 'L') && (name[i + 2].charAt(0) == 'l' || name[i + 2].charAt(0) == 'L')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
                if ((name[i].charAt(0) == 'l' || name[i].charAt(0) == 'L') && (name[i + 2].charAt(0) == 'l' || name[i + 2].charAt(0) == 'L')) {
                    if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                        name[i + 1] = "و";
                    }

                }
            }
            //M
            if ((name[i].charAt(0) == 'm' || name[i].charAt(0) == 'M') && (name[i + 2].charAt(0) == 'm' || name[i + 2].charAt(0) == 'M')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'm' || name[i].charAt(0) == 'M') && (name[i + 2].charAt(0) == 'm' || name[i + 2].charAt(0) == 'M')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'm' || name[i].charAt(0) == 'M') && (name[i + 2].charAt(0) == 'm' || name[i + 2].charAt(0) == 'M')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'm' || name[i].charAt(0) == 'M') && (name[i + 2].charAt(0) == 'm' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //N
            if ((name[i].charAt(0) == 'n' || name[i].charAt(0) == 'N') && (name[i + 2].charAt(0) == 'n' || name[i + 2].charAt(0) == 'N')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'n' || name[i].charAt(0) == 'N') && (name[i + 2].charAt(0) == 'n' || name[i + 2].charAt(0) == 'N')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'n' || name[i].charAt(0) == 'N') && (name[i + 2].charAt(0) == 'n' || name[i + 2].charAt(0) == 'N')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'n' || name[i].charAt(0) == 'N') && (name[i + 2].charAt(0) == 'n' || name[i + 2].charAt(0) == 'N')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //P
            if ((name[i].charAt(0) == 'p' || name[i] == "P") && (name[i + 2].charAt(0) == 'p' || name[i + 2].charAt(0) == 'P')) {
                if (name[i + 1].charAt(0) == 'A' || name[i + 1].charAt(0) == 'a') {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'p' || name[i] == "P") && (name[i + 2].charAt(0) == 'p' || name[i + 2].charAt(0) == 'P')) {
                if (name[i + 1].charAt(0) == 'U' || name[i + 1].charAt(0) == 'u') {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'p' || name[i] == "P") && (name[i + 2].charAt(0) == 'p' || name[i + 2].charAt(0) == 'P')) {
                if (name[i + 1].charAt(0) == 'E' || name[i + 1].charAt(0) == 'e') {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'p' || name[i].charAt(0) == 'P') && (name[i + 2].charAt(0) == 'p' || name[i + 2].charAt(0) == 'P')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //R
            if ((name[i].charAt(0) == 'r' || name[i].charAt(0) == 'R') && (name[i + 2].charAt(0) == 'r' || name[i + 2].charAt(0) == 'R')) {
                if (name[i + 1] == "A" || name[i + 1] == "a") {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'r' || name[i].charAt(0) == 'R') && (name[i + 2].charAt(0) == 'r' || name[i + 2].charAt(0) == 'R')) {
                if (name[i + 1] == "U" || name[i + 1] == "u") {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'r' || name[i].charAt(0) == 'R') && (name[i + 2].charAt(0) == 'r' || name[i + 2].charAt(0) == 'R')) {
                if (name[i + 1] == "E" || name[i + 1] == "e") {
                    name[i + 1] = "ي";
                }

            }
            if ((name[i].charAt(0) == 'r' || name[i].charAt(0) == 'R') && (name[i + 2].charAt(0) == 'r' || name[i + 2].charAt(0) == 'R')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //v
            if ((name[i].charAt(0) == 'v' || name[i].charAt(0) == 'V') && (name[i + 2].charAt(0) == 'v' || name[i + 2].charAt(0) == 'V')) {
                if (name[i + 1] == "A" || name[i + 1] == "a") {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'v' || name[i].charAt(0) == 'V') && (name[i + 2].charAt(0) == 'v' || name[i + 2].charAt(0) == 'V')) {
                if (name[i + 1] == "U" || name[i + 1] == "u") {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'v' || name[i].charAt(0) == 'V') && (name[i + 2].charAt(0) == 'v' || name[i + 2].charAt(0) == 'V')) {
                if (name[i + 1] == "E" || name[i + 1] == "e") {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'v' || name[i].charAt(0) == 'V') && (name[i + 2].charAt(0) == 'v' || name[i + 2].charAt(0) == 'V')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //x
            if ((name[i].charAt(0) == 'x' || name[i].charAt(0) == 'X') && (name[i + 2].charAt(0) == 'x' || name[i + 2].charAt(0) == 'X')) {
                if (name[i + 1] == "A" || name[i + 1] == "a") {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'x' || name[i].charAt(0) == 'X') && (name[i + 2].charAt(0) == 'x' || name[i + 2].charAt(0) == 'X')) {
                if (name[i + 1] == "U" || name[i + 1] == "u") {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'x' || name[i].charAt(0) == 'X') && (name[i + 2].charAt(0) == 'x' || name[i + 2].charAt(0) == 'X')) {
                if (name[i + 1] == "E" || name[i + 1] == "e") {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'x' || name[i].charAt(0) == 'X') && (name[i + 2].charAt(0) == 'x' || name[i + 2].charAt(0) == 'X')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
            //z
            if ((name[i].charAt(0) == 'z' || name[i].charAt(0) == 'Z') && (name[i + 2].charAt(0) == 'z' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "A" || name[i + 1] == "a") {
                    name[i + 1] = "ا";
                }
            }
            if ((name[i].charAt(0) == 'z' || name[i].charAt(0) == 'Z') && (name[i + 2].charAt(0) == 'z' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "U" || name[i + 1] == "u") {
                    name[i + 1] = "و";
                }
            }
            if ((name[i].charAt(0) == 'z' || name[i].charAt(0) == 'Z') && (name[i + 2].charAt(0) == 'z' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "E" || name[i + 1] == "e") {
                    name[i + 1] = "ي";
                }
            }
            if ((name[i].charAt(0) == 'z' || name[i].charAt(0) == 'Z') && (name[i + 2].charAt(0) == 'z' || name[i + 2].charAt(0) == 'Z')) {
                if (name[i + 1] == "ou" || name[i + 1] == "OU" || name[i + 1] == "oU" || name[i + 1] == "Ou") {
                    name[i + 1] = "و";
                }

            }
        }
        return name;
    }

    // Rule 4   
    public static String[] Rule4(String[] name) {
        for (int i = 1; i < name.length; i++) {

            if (name[name.length - 2].charAt(0) != 'a' || name[name.length - 2].charAt(0) != 'A' || name[name.length - 2].charAt(0) != 'u' || name[name.length - 2].charAt(0) != 'U' || name[name.length - 2].charAt(0) != 'i' || name[name.length - 2].charAt(0) != 'I' || name[name.length - 2].charAt(0) != 'y' || name[name.length - 2].charAt(0) != 'Y'
                    || name[name.length - 2].charAt(0) != 'o' || name[name.length - 2].charAt(0) != 'O') {
                if (name[name.length - 1].charAt(0) == 'a' || name[name.length - 1].charAt(0) == 'A') {
                    name[name.length - 1] = "ا";
                } else if (name[name.length - 1].charAt(0) == 'u' || name[name.length - 1].charAt(0) == 'U' || name[name.length - 1].charAt(0) == 'O' || name[name.length - 1].charAt(0) == 'o') {
                    name[name.length - 1] = "و";
                } else if (name[name.length - 1].charAt(0) == 'I' || name[name.length - 1].charAt(0) == 'i' || name[name.length - 1].charAt(0) == 'E' || name[name.length - 1].charAt(0) == 'e' || name[name.length - 1].charAt(0) == 'Y' || name[name.length - 1].charAt(0) == 'y') {
                    name[name.length - 1] = "ي";
                }

            }
        }

        return name;
    }

    // Rule 5 
    public static String[] Rule5(String[] name) {
        for (int i = 0; i < name.length - 1; i++) {
            if (name[i].charAt(0) != 'a' || name[i].charAt(0) != 'A' || name[i].charAt(0) != 'u' || name[i].charAt(0) != 'U' || name[i].charAt(0) != 'i' || name[i].charAt(0) != 'I' || name[i].charAt(0) != 'y' || name[i].charAt(0) != 'Y' || name[i].charAt(0) != 'o' || name[i].charAt(0) != 'O'
                    && name[i + 2].charAt(0) != 'a' || name[i + 2].charAt(0) != 'A' || name[i + 2].charAt(0) != 'u' || name[i + 2].charAt(0) != 'U' || name[i + 2].charAt(0) != 'i' || name[i + 2].charAt(0) != 'I' || name[i + 2].charAt(0) != 'y' || name[i + 2].charAt(0) != 'Y' || name[i + 2].charAt(0) != 'o' || name[i + 2].charAt(0) != 'O') {
                if (name[i + 1].charAt(0) == 'S' || name[i + 1].charAt(0) == 's') {
                    try {
                        if (name[i + 1].charAt(1) == 'S' || name[i + 1].charAt(1) == 's') {
                            name[i + 1] = "س";
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        return name;
    }

    // Rule 6
    public static String[] Rule6(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if ((name[name.length - 2].charAt(0) == 'a' || name[name.length - 2].charAt(0) == 'A') && (name[name.length - 1].charAt(0) == 'H' || name[name.length - 1].charAt(0) == 'h')) {
                name[name.length - 2] = "ة";
                name[name.length - 1] = null;
            }
        }
        return name;
    }

    //Rule31 
    public static String[] Rule31(String[] name) {
        for (int i = 1; i < name.length; i++) {
            if (name[name.length - 1].charAt(0) == 'a' || name[name.length - 1].charAt(0) == 'A') {
                if (name[name.length - 1].charAt(1) == 'i' || name[name.length - 1].charAt(1) == 'I') {
                    name[name.length - 1] = "اي";
                }
            }
            if (name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a') {
                if (name[i].charAt(1) == 'I' || name[i].charAt(1) == 'i') {
                    name[i] = "ي";
                }
            }
        }
        return name;
    }

    // Rule 7
    public static String[] Rule7(String[] name) {
        for (int i = 0; i < name.length; i++) {
            try {
                if (name[name.length - 3].charAt(0) != 'A' || name[name.length - 3].charAt(0) != 'a' || name[name.length - 3].charAt(0) != 'U' || name[name.length - 3].charAt(0) != 'u'
                        || name[name.length - 3].charAt(0) != 'E' || name[name.length - 3].charAt(0) != 'e' || name[name.length - 3].charAt(0) != 'Y' || name[name.length - 3].charAt(0) != 'y'
                        || name[name.length - 3].charAt(0) != 'O' || name[name.length - 3].charAt(0) != 'o') {
                    /* if ((name[name.length - 2].charAt(0) == 'U' || name[name.length - 2].charAt(0) == 'u' || name[name.length - 2].charAt(0) == 'I' || name[name.length - 2].charAt(0) == 'i'
                     || name[name.length - 2].charAt(0) == 'Y' || name[name.length - 2].charAt(0) == 'y' || name[name.length - 2].charAt(0) == 'O' || name[name.length - 2].charAt(0) == 'o'
                     || name[name.length - 2].charAt(0) == 'E' || name[name.length - 2].charAt(0) == 'e') && (name[name.length - 1].charAt(0) == 'A' || name[name.length - 1].charAt(0) == 'a')) {
                     name[name.length - 1] = " ";
                    
                     break;
                     } else
                    if ((name[name.length - 2].charAt(0) == 'A' || name[name.length - 2].charAt(0) == 'a' || name[name.length - 2].charAt(0) == 'I' || name[name.length - 2].charAt(0) == 'i'
                            || name[name.length - 2].charAt(0) == 'Y' || name[name.length - 2].charAt(0) == 'y' || name[name.length - 2].charAt(0) == 'O' || name[name.length - 2].charAt(0) == 'o'
                            || name[name.length - 2].charAt(0) == 'E' || name[name.length - 2].charAt(0) == 'e') && (name[name.length - 1].charAt(0) == 'U' || name[name.length - 1].charAt(0) == 'u')) {
                        name[name.length - 1] = " ";
                        break;
                    } else if ((name[name.length - 2].charAt(0) == 'U' || name[name.length - 2].charAt(0) == 'u' || name[name.length - 2].charAt(0) == 'I' || name[name.length - 2].charAt(0) == 'i'
                            || name[name.length - 2].charAt(0) == 'Y' || name[name.length - 2].charAt(0) == 'y' || name[name.length - 2].charAt(0) == 'O' || name[name.length - 2].charAt(0) == 'o'
                            || name[name.length - 2].charAt(0) == 'A' || name[name.length - 2].charAt(0) == 'a') && (name[name.length - 1].charAt(0) == 'E' || name[name.length - 1].charAt(0) == 'e')) {
                        name[name.length - 1] = " ";
                        break;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }

        return name;
    }

    // Rule 8
    public static String[] Rule8(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0].charAt(0) == 'A' || name[0].charAt(0) == 'a') {
                for (int j = 1; j < name.length - 1; j++) {
                    if (name[j].charAt(0) != 'A' || name[j].charAt(0) != 'a' || name[j].charAt(0) != 'E' || name[j].charAt(0) != 'e' || name[j].charAt(0) != 'U' || name[j].charAt(0) != 'u'
                            || name[j].charAt(0) != 'Y' || name[j].charAt(0) != 'y' || name[j].charAt(0) != 'O' || name[j].charAt(0) != 'o' || name[j].charAt(0) != 'I' || name[j].charAt(0) != 'i') {
                        if (name[name.length - 1].charAt(0) == 'A' || name[name.length - 1].charAt(0) == 'a') {
                            name[name.length - 1] = " ";
                        }
                        break;
                    }
                }
                break;
            }
            if (name[0].charAt(0) == 'U' || name[0].charAt(0) == 'u') {
                for (int j = 1; j < name.length - 1; j++) {
                    if (name[j].charAt(0) != 'A' || name[j].charAt(0) != 'a' || name[j].charAt(0) != 'E' || name[j].charAt(0) != 'e' || name[j].charAt(0) != 'U' || name[j].charAt(0) != 'u'
                            || name[j].charAt(0) != 'Y' || name[j].charAt(0) != 'y' || name[j].charAt(0) != 'O' || name[j].charAt(0) != 'o' || name[j].charAt(0) != 'I' || name[j].charAt(0) != 'i') {
                        if (name[name.length - 1].charAt(0) == 'U' || name[name.length - 1].charAt(0) == 'u') {
                            name[name.length - 1] = " ";
                        }
                        break;
                    }
                }
                break;
            }
        }
        return name;
    }

    // Rule 9
    public static String[] Rule9(String[] name) {
        for (int i = 1; i < name.length - 1; i++) {
            if (name[i].charAt(0) == 'a' || name[i].charAt(0) == 'A') {
                try {
                    if (name[i].charAt(1) == 'a' || name[i].charAt(1) == 'A') {
                        name[i] = "ع";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;

    }

    //Rule 10
    public static String[] Rule10(String[] name) {
        for (int i = 1; i < name.length; i++) {

            if (name[name.length - 1].charAt(0) == 'a' || name[name.length - 1].charAt(0) == 'A') {

                if (name[name.length - 1].charAt(1) == 'a' || name[name.length - 1].charAt(1) == 'A') {
                    name[name.length - 1] = "اء";

                }
            }
        }
        return name;
    }

    // Rule 11
    public static String[] Rule11(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0] != null && name[name.length - 1] != null) {
                if ((name[i].charAt(0) == 'e' || name[i].charAt(0) == 'E') || (name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i') || (name[i].charAt(0) == 'y' || name[i].charAt(0) == 'Y')) {
                    try {
                        if ((name[i].charAt(1) == 'e' || name[i].charAt(1) == 'E') || (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') || (name[i].charAt(1) == 'y' || name[i].charAt(1) == 'Y')) {
                            name[i] = "ي";
                        }
                    } catch (Exception e) {
                        continue;
                    }
                } else if (name[i].charAt(0) == 'i' || name[i].charAt(0) == 'I') {
                    try {
                        if (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') {
                            name[i] = "ي";
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }

        return name;
    }

    //Rule 12       
    public static String[] Rule12(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'a' || name[i + 1].charAt(0) == 'A')) {
                name[i + 1] = "ا";

            }
            if ((name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'u' || name[i + 1].charAt(0) == 'U')) {
                name[i + 1] = "و";

            }
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'i' || name[i + 1].charAt(0) == 'I')) {
                name[i + 1] = "ي";

            }
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'e' || name[i + 1].charAt(0) == 'E')) {
                name[i + 1] = "ي";

            }
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'O' || name[i].charAt(0) == 'o')
                    && (name[i + 1].charAt(0) == 'y' || name[i + 1].charAt(0) == 'Y')) {
                name[i + 1] = "ي";

            }
            if ((name[i].charAt(0) == 'U' || name[i].charAt(0) == 'u' || name[i].charAt(0) == 'A' || name[i].charAt(0) == 'a' || name[i].charAt(0) == 'I' || name[i].charAt(0) == 'i' || name[i].charAt(0) == 'E' || name[i].charAt(0) == 'e' || name[i].charAt(0) == 'Y' || name[i].charAt(0) == 'y')
                    && (name[i + 1].charAt(0) == 'o' || name[i + 1].charAt(0) == 'O')) {
                name[i + 1] = "و";

            }

        }
        return name;
    }

    // Rule 13
    public static String[] Rule13(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0] != null) {
                if (name[name.length - 1].charAt(0) == 'a' || name[name.length - 1].charAt(0) == 'A') {
                    name[name.length - 1] = "ا";
                } else if ((name[name.length - 1].charAt(0) == 'e' || name[name.length - 1].charAt(0) == 'E') || (name[name.length - 1].charAt(0) == 'y' || name[name.length - 1].charAt(0) == 'Y') || (name[name.length - 1].charAt(0) == 'I' || name[name.length - 1].charAt(0) == 'i')) {
                    name[name.length - 1] = "ي";
                } else if ((name[name.length - 1].charAt(0) == 'o' || name[name.length - 1].charAt(0) == 'O') || (name[name.length - 1].charAt(0) == 'u' || (name[name.length - 1].charAt(0) == 'U'))) {
                    name[name.length - 1] = "و";
                }
            }
        }

        return name;
    }

    // Rule 14 
    public static String[] Rule14(String[] name) {
        for (int i = 1; i < name.length; i++) {

            if (((name[name.length - 1].charAt(0) == 'a') || (name[name.length - 1].charAt(0) == 'A')) && (name[name.length - 2].charAt(0) == 'i' || name[name.length - 2].charAt(0) == 'I')) {
                name[name.length - 1] = "ي";
                //  name[name.length - 2] = " ";

            }

        }
        return name;

    }

    // Rule 15
    public static String[] Rule15(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if ((name[name.length - 1].charAt(0) == 'N' || name[name.length - 1].charAt(0) == 'n') && (name[name.length - 2].charAt(0) == 'o' || name[name.length - 2].charAt(0) == 'O')
                    && (name[name.length - 3].charAt(0) == 'i' || name[name.length - 3].charAt(0) == 'I') && (name[name.length - 4].charAt(0) == 't' || name[name.length - 4].charAt(0) == 'T')) {
                name[name.length - 4] = "ت";
                name[name.length - 3] = "ش";
                name[name.length - 2] = "ن";
                name[name.length - 1] = " ";
                break;
            }
        }

        return name;

    }

    //Rule 16
    public static String[] Rule16(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'g' || name[i].charAt(0) == 'G') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "غ";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;
    }

    //Rule 17 
    public static String[] Rule17(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'p' || name[i].charAt(0) == 'P') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "ف";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;
    }

    //Rule 18 
    public static String[] Rule18(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "تش";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;
    }

    // Rule 19
    public static String[] Rule19(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 's' || name[i].charAt(0) == 'S') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "ش";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return name;
    }

    //Rule 20
    public static String[] Rule20(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                if (name[i].charAt(0) == 't' || name[i].charAt(0) == 'T') {
                    try {
                        if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                            name[i] = "ث";
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        return name;
    }

    //Rule 21 
    public static String[] Rule21(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0] != null) {
                if (name[name.length - 2].charAt(0) == 't' || name[name.length - 2].charAt(0) == 'T') {
                    try {
                        if (name[name.length - 2].charAt(1) == 'h' || name[name.length - 2].charAt(1) == 'H') {

                            if (name[name.length - 1].charAt(0) == 'E' || name[name.length - 1].charAt(0) == 'e') {
                                name[name.length - 2] = "ذ";
                            } else if (name[name.length - 1].charAt(0) == 'o' || name[name.length - 1].charAt(0) == 'O') {
                                name[name.length - 2] = "ذ";
                            } else if (name[name.length - 1].charAt(0) == 'u' || name[name.length - 1].charAt(0) == 'U') {
                                name[name.length - 2] = "ذ";
                            }

                        }

                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        return name;
    }

    //Rule 22
    public static String[] Rule22(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'e' || name[i].charAt(0) == 'E') {
                try {
                    if (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') {
                        name[i] = "اي";
                    }
                } catch (Exception e) {
                    continue;
                }

            } else if (name[i].charAt(0) == 'i' || name[i].charAt(0) == 'I') {
                try {
                    if (name[i].charAt(1) == 'e' || name[i].charAt(1) == 'E') {
                        name[i] = "ي";
                    }
                } catch (Exception e) {
                    continue;
                }
            } else if (name[i].charAt(0) == 'a' || name[i].charAt(0) == 'A') {
                try {
                    if (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') {
                        name[i] = "ي";
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        return name;
    }

    //Rule 23
    public static String[] Rule23(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if ((name[i].charAt(0) == 'o' || name[i].charAt(0) == 'O') || (name[i].charAt(0) == 'u' || name[i].charAt(0) == 'U')) {
                try {
                    if ((name[i].charAt(1) == 'o' || name[i].charAt(1) == 'O') || (name[i].charAt(1) == 'u' || name[i].charAt(1) == 'U')) {
                        name[i] = "و";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    //Rule 24
    public static String[] Rule24(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'e' || name[i].charAt(0) == 'E') {
                try {
                    if (name[i].charAt(1) == 'y' || name[i].charAt(1) == 'Y') {
                        name[i] = "إي";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    //Rule 25
    public static String[] Rule25(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                try {
                    if (name[i].charAt(1) == 'k' || name[i].charAt(1) == 'K') {
                        name[i] = "ك";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    //Rule 26
    public static String[] Rule26(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'd' || name[i].charAt(0) == 'D') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "ظ";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }
/////rule 30

    public static String[] Rule30(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[name.length - 2].charAt(0) == 'A' || name[name.length - 2].charAt(0) == 'a') {
                name[name.length - 2] = "ا";
            }
            if (name[name.length - 2].charAt(0) == 'u' || name[name.length - 2].charAt(0) == 'U') {
                name[name.length - 2] = "و";
            }
//            if (name[name.length-2].charAt(0)== 'o' || name[name.length-2].charAt(0)=='O'){
//                name[name.length-2] ="و";
//            }
//            if (name[name.length-2].charAt(0)== 'I' || name[name.length-2].charAt(0)=='i'){
//                name[name.length-2] ="ي";
//            }
//            if (name[name.length-2].charAt(0)== 'y' || name[name.length-2].charAt(0)=='Y'){
//                name[name.length-2] ="ي";
//            }
            if (name[name.length - 2].charAt(0) == 'E' || name[name.length - 2].charAt(0) == 'e') {
                name[name.length - 2] = " ";
            }

        }

        return name;
    }
    //

    //Rule 27
    public static String[] Rule27(String[] name) {
        String[] temp = new String[name.length + 1];
        for (int i = 0; i < name.length; i++) {

            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                if (name[i + 1].charAt(0) == 'Y' || name[i + 1].charAt(0) == 'y') {
                    name[i] = "س";
                }
            }
            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                try {
                    if (name[i].charAt(1) == 'e' || name[i].charAt(1) == 'E') {
                        for (int j = 0; j < name.length + 1; j++) {
                            try {
                                if (j < i) {
                                    temp[j] = name[j];
                                } else if (j == i) {
                                    temp[j] = "س";
                                    temp[j + 1] = "" + name[i].charAt(1);
                                } else if (j > i) {
                                    temp[j + 1] = name[j];
                                }
                            } catch (Exception e) {
                                break;
                            }
                        }
                        return temp;
                    }
                } catch (Exception e) {
                    continue;
                }

            }

            if (name[i].charAt(0) == 'c' || name[i].charAt(0) == 'C') {
                try {
                    if (name[i].charAt(1) == 'i' || name[i].charAt(1) == 'I') {
                        for (int j = 0; j < name.length + 1; j++) {
                            try {
                                if (j < i) {
                                    temp[j] = name[j];
                                } else if (j == i) {
                                    temp[j] = "س";
                                    temp[j + 1] = "" + name[i].charAt(1);
                                } else if (j > i) {
                                    temp[j + 1] = name[j];
                                }
                            } catch (Exception e) {
                                break;
                            }
                        }
                        return temp;
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    // Rule 28
    public static String[] Rule28(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].charAt(0) == 'k' || name[i].charAt(0) == 'K') {
                try {
                    if (name[i].charAt(1) == 'h' || name[i].charAt(1) == 'H') {
                        name[i] = "خ";
                    }
                } catch (Exception e) {
                    continue;
                }

            }
        }
        return name;
    }

    // Rule33 

    public static String[] Rule33(String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[0].charAt(0) == 'i' || name[0].charAt(0) == 'I') {
                name[0] = "اي";
            }
        }
        return name;
    }

    public   String[] isRule(String[] name) {
        int[] indexes = new int[name.length];
        for (int i = 0; i < name.length; i++) {
            Rule14(name);
            Rule24(name);
            Rule7(name);

            Rule22(name);
            Rule33(name);

            Rule4(name);
            Rule11(name);

            Rule23(name);
            Rule2(name);
            Rule9(name);
            Rule27(name);
            Rule20(name);
            Rule21(name);
            Rule8(name);

            Rule12(name);
            Rule30(name);
            Rule15(name);
            Rule5(name);

            Rule13(name);

            Rule16(name);
            Rule17(name);
            Rule18(name);
            Rule19(name);

            Rule1(name);
            Rule25(name);
            Rule26(name);
            String temp[] = Rule27(name);
            Rule28(temp);

            //       getIndexes(name);
        /*   for(int j = 0 ; j<indexes.length ;j++){
             System.out.println(indexes[j]);
             }
        }
        return name;
    }

    public   int[] result(String[] name) {

        return getIndexes(isRule(name));
    }

    public   int[] getIndexes(String[] name) {
        int[] indexes = new int[name.length];
        int[] indexes2 = new int[name.length];
//       Integer[] inTindexes = new Integer[name.length];
//               ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            indexes[i] = 100;
        }

        for (int i = 0; i < name.length; i++) {

            if (name[i].matches("[a-zA-Z]+")) {

                indexes[i] = i;
                if (indexes[i] != 100) {
                    indexes2[i] = i;
                }

            }


            System.out.println(indexes[i]);

        }


        return indexes;
    }
}
*/