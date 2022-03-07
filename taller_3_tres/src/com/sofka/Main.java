package com.sofka;

public class Main {
    public static final String symbol = "*";

    public static void main(String[] args) {
        for (int i = 0; i <= 14; i++) {
            if (i == 1) {
                for (int z = 0; z < 10 - i; z++) {
                    System.out.print(" ");
                }
                System.out.println(symbol);
            } else if (i <= 10) {
                for (int z = 0; z < 10 - i; z++) {
                    System.out.print(" ");
                }
                for (int x = 2; x <= i + i; x++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("        ");
            System.out.println(symbol + symbol + symbol);
        }
    }
}
