package com.company.function;

public class Main {
    public static void main(String[] args) {

//        足し算
        int result = sum(2, 3);
        System.out.println(result);
//        void
        SayYeah();
//        文字列
        System.out.println(add("こんにちは", "世界"));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void SayYeah() {
        System.out.println("say yeah");
    }

    static String add(String c, String d) {
        return c + d;
    }
}


