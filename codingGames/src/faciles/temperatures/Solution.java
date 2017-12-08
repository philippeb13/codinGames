package faciles.temperatures;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int result = Integer.MAX_VALUE;
        CompareTo compare = (int param1, int param2) -> (Math.abs(param1) < Math.abs(param2)) || (Math.abs(param1) == Math.abs(param2) && param1 > 0) ? param1 : param2;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            result = compare.compare(t, result);
        }
        if (result == Integer.MAX_VALUE) result = 0;

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }

    interface CompareTo {
        int compare(int param1, int param2);
    }
}