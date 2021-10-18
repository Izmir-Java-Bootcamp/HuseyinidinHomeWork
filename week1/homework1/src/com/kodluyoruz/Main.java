package com.kodluyoruz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bir sayı girin: ");
        Scanner sayi = new Scanner(System.in);
        int yildiz = sayi.nextInt();

        Kare(yildiz);
    }
    public static void Kare(int yildiz){

        for (int a = 1; a <= yildiz; a++) {
            for (int b = 1; b <= yildiz; b++) {
                if ((a == 1) || (a == yildiz) || (b == 1) || (b == yildiz)) {
                    System.out.print("*");
                } else {
                    if (a % 2 == 0) {
                        if (b % 2 == 0) {
                            System.out.print("+");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    if (a % 2 == 1) {
                        if (b % 2 == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print("+");
                        }
                    }


                }
            }
            System.out.println();
        }
    }

}
