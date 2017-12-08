package faciles.horseDuals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> piList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            piList.add(in.nextInt());
        }
        Collections.sort(piList);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int closestEcart = 999999;

        for (int i = 0; i < piList.size() - 1; i++) {
            int ecart = Math.abs(piList.get(i) - piList.get(i+1));
            if (ecart < closestEcart) {
                closestEcart = ecart;
            }
        }
        System.out.println(closestEcart);
    }
}
