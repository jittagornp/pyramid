package com.blogspot.na5cent.pyramid;

/**
 * @author redcrow
 */
public class Example2 {

    private static void walk(int max, int running, boolean deep) {
        if (deep) {
            walk(running, 1, false);
        } else {
            System.out.print(running + " ");
        }

        if (running == max) {
            if (!deep) {
                System.out.println("");
            }
            return;
        }

        walk(max, ++running, deep);
        if (deep) {
            walk(running - 1, 1, false);
        }
    }

    public static void main(String[] args) {
        walk(7, 1, true);
    }

}
