package com.blogspot.na5cent.pyramid;

/**
 * @author redcrow
 */
public class Example2 {

    private static void walk(int max, int running, boolean deep) {
        if (deep) walk(running, 1, false);

        System.out.print(deep ? "" : running + " ");
        if (running == max) {
            System.out.print(deep ? "" : "\n");
            return;
        }
        walk(max, ++running, deep);

        if (deep) walk(running - 1, 1, false);
    }

    public static void main(String[] args) {
        walk(5, 1, true);
    }
}
