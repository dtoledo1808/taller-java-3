package com.sofka;

import java.util.Scanner;

public class Main {
    public static String name;
    public static int option;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.flush();
            System.out.println("Menu de usuario\n" +
                    "1. capturar nombre\n" +
                    "2. saludar\n" +
                    "3. salir del sistema");
            option = entrada.nextInt();
            entrada.nextLine();
            switch (option){
                case 1:
                    System.out.println("Ingresa tu nombre");
                    name = entrada.nextLine();
                    break;
                case 2:
                    System.out.println("Hola "+name);
            }
        }while (option!= 3);

    }
}
