package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce los caracteres: ");
        String caract = teclado.nextLine().trim();
        int[] list = new int[caract.length()];
        boolean orden = true;
        for (int i = 0; i < caract.length(); i++){
            int data = caract.charAt(i);
            list[i] = data;
        }
        for (int i = 0; i < list.length -1; i++){
            if (list[i + 1] - list[i] !=1){
                orden = false;
                break;
            }
        }
        System.out.println(" => " + orden);
    }
}