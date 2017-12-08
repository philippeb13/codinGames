package faciles.AsciiArt;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        char[] arrayT = T.toUpperCase().toCharArray();
        int codeAsciiA = (int) 'A';
        int codeAsciiZ = (int) 'Z';

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            String stringToConcat = "";
            for (char currentChar : arrayT) {
                int asciiCode = (int) currentChar;
                int index;
                if (asciiCode < codeAsciiA || asciiCode > codeAsciiZ) {
                    index = 26;
                } else {
                    index = asciiCode - codeAsciiA;
                }
                int begin = index * L;
                int end = begin + L;
                stringToConcat += ROW.substring(begin, end);

            }
            System.out.println(stringToConcat);
        }
    }
}