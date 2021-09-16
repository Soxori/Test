package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej pocet certu");
        int x = sc.nextInt();
        int counter;

        for (int i = 1; i <= x; i++) {
            counter = i * i;
            for (int j = 0; j < counter; j++) {
                System.out.print("😈");
            }
            System.out.println();
        }
    }
}
