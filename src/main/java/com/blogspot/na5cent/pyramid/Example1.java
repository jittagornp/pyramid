/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.pyramid;

import java.util.Scanner;

/**
 * @author redcrow
 */
public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = n * (n + 1) / 2;
        int bigSpace = (n - 1) / 2;

        for (int i = 1; i <= size; i++) {
            int numb = i % n;
            int space = bigSpace - i / n;

            boolean star = numb > space && numb <= (n - space);
            System.out.print(star ? "*" : " ");
            System.out.print(numb == 0 ? "\n" : "");
        }
    }
}
