package com.geekbrains;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        int massive[] = {1, 0, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 1) {
                massive[i] = 0;
            } else if (massive[i] == 0) {
                massive[i] = 1;
            }
        }
        System.out.println(Arrays.toString(massive));

        int massive1[] = new int[100];
        for (int i = 0; i < massive1.length; i++) {
            massive1[i] = i + 1;
        }
        System.out.println(Arrays.toString(massive1));

        int massive2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 5, 9, 1};
        for (int i = 0; i < massive2.length; i++) {
            if (massive2[i] < 6) {
                massive2[i] = massive2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(massive2));

        int massive3[][] = new int[3][3];
        for (int i = 0; i < massive3.length; i++) {
            for (int j = 0; j < massive3.length; j++) {
                if ((i == j) || ((j == massive3.length - 1) && (i == 0)) || ((i == massive3.length - 1) && (j == 0))) {
                    massive3[i][j] = 1;
                } else {
                    massive3[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < massive3.length; i++) {
            for (int j = 0; j < massive3.length; j++) {
                System.out.print(massive3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(createArray(6, 8)));

        int massive4[] = {1, 4, 6, 2, 0, 1, 7, 8};
        int maxValue = massive4[0];
        int minValue = massive4[0];
        for (int i = 1; i < massive4.length; i++) {
            if (massive4[i] >= maxValue) {
                maxValue = massive4[i];
            }
            if (massive4[i] <= minValue) {
                minValue = massive4[i];
            }

        }
        System.out.println("maxValue: " + maxValue + " minValue: " + minValue);
        int chekmass[] = {6, 4, 1, 1, 5, 5, 10, 2};
        System.out.println(checkBalance(chekmass));
    }

    public static int[] createArray(int len, int initialValue) {
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static boolean checkBalance(int mas[]) {
        int sumleft = 0;
        int sumright = 0;
        boolean otvet = false;
        for (int i = 0; i < mas.length; i++) {
            sumleft = sumleft + mas[i];
            for (int j = i + 1; j < mas.length; j++) {
                sumright = sumright + mas[j];
            }
            if (sumleft == sumright) {
                otvet = true;
                break;
            }
            sumright = 0;
        }
        if (otvet == true) {
            return true;
        } else {
            return false;
        }
    }
}
