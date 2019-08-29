package com.company.practice;

public class Ex06 {
    public static void main(String[] args) {
        String[] kome = {"*","*","*","*","*","*","*","*"};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(kome[i]);
            }
            System.out.println();

        }
    }
}
