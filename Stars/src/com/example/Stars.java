package com.example;

import java.util.Scanner;

public class Stars {

    public static void main(String[] args) {

        System.out.println("Введите высоту и ширину рамки. Введите слово.");
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        String a = scan.next();
        int len = a.length();
        //char[] result = a.toCharArray();
        int midl = (width - len) / 2;
        int midl2 = height / 2;


        if (len + 2 > width || height < 3) {
            System.out.print("Ошибка");

        } else {

            for (int i = 0; i < height; i++) {

                for (int k = 0; k < width; k++) {

                    if (k == 0 || k == width - 1 || i == 0 || i == height - 1) {
                        System.out.print('*');

                    } else if (k == midl && i == midl2) {

                        for (int p = 0; p < a.length(); p++) {
                            System.out.print(a.charAt(p));
                            k++;
                        }
                        k--;
                    } else {
                        System.out.print(" ");

                    }
                }

                System.out.println();
            }

        }
    }
}