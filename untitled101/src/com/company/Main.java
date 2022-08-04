package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);
        int i = 1 ;
        int res =0;
        System.out.print("  bo'unuvchi sonlar : ");
        int a =scanner.nextInt();
        System.out.print(" gacha bo'linsin: ");
        int b = scanner.nextInt();
        while (i<=b) {

            if (i % a == 0) {
                res++;
                System.out.println(i + " ");

            }
            i++;
       }
        System.out.println();
        System.out.println(res );

    }
}
