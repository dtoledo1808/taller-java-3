package com.sofka;

import java.util.Scanner;

public class Main {
    public static int tabla;

    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Que tabla de multiplicar deseas ver");
        tabla = entrada.nextInt();
        for(int i = 0; i<=10;i++){
            System.out.println(tabla+" x "+i+" = "+i*tabla);
        }

    }
}
