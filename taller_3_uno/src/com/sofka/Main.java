package com.sofka;

public class Main {
    public static final String symbol = "*";

    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i ++){
            for(int x = 0; x<= i; x ++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
