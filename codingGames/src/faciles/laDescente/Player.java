package faciles.laDescente;

import java.util.Scanner;

public class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int indexToShoot = 0;
            int highestHeight = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (mountainH > highestHeight) {
                    indexToShoot = i;
                    highestHeight = mountainH;
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.out.println(indexToShoot); // The index of the mountain to fire on.
        }
    }
}
