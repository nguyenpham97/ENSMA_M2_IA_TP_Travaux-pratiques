
package fr.ensma.a3.ia.mymultichat.common;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author lammi
 */
public class IOAction {

    private static final Scanner scan = new Scanner(System.in);
    private static final PrintStream out = System.out;

    public static String readIO(String... notes) {
        if (notes.length > 0) {
            for (int i = 0; i < notes.length - 1; i++) {
                System.out.println(notes[i]);
            }
            System.out.println(notes[notes.length - 1]);

        }

        String str = scan.nextLine();
        return str;
    }

    public static void printIO(String message) {
        out.print("\n>>>>>>>>>>Message:");
        out.print(message);
        out.println("<<<<<<<<<<");

    }
}