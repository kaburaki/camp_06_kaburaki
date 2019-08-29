package com.company.practice;

public class Ex07 {
    public static void main(String[] args) {
//        String[] kome = {"*","*","*","*","*","*","*","*"};
//
//        for (int i =0; i < 4; i++) {
//            for (int j = 4; j > i; j--) {
//                System.out.print(kome[i]);
//            }
//            System.out.println();
//
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
