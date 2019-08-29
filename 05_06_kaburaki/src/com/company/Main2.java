package com.company;

public class Main2 {
    public static void main(String[] args) {


////        練習１
//        String[] greetings;
//        greetings = new String[4];
//        greetings[0] = "hello";
//        greetings[1] = "こんにちは" ;
//        greetings[2] = "ニーハオ" ;
//        greetings[3] = "ボンジュール" ;
//
//        System.out.println(greetings[0]);
//        System.out.println(greetings[1]);
//        System.out.println(greetings[2]);
//        System.out.println(greetings[3]);

////        長さを確認
//        System.out.println(greetings.length);
//
////        同時に４つ入れる
//        String[] greetings2 = {"hello","こんにちは","ニーハオ","チャオ"};
//        System.out.println(greetings2[0]);

////        整数の表示
//        int[] test = {1,2,3,4,5};
//        System.out.println(test[0]);
//        System.out.println(test[1]);
//        System.out.println(test[2]);
//        System.out.println(test[3]);
//        System.out.println(test[4]);

////        for(《初期処理》; 《継続条件》;《繰り返し毎処理》{ 《繰り返し処理》}
//
//        for (int i = 0; i < 5; i++) { System.out.println(i +"回目") ;
//            }
////            i++  = i+1


        String[] greetings3 = {"hello","こんにちは","ニーハオ","チャオ"};

        for (int i = 0; i < greetings3.length; i++) {
            System.out.println(greetings3[i]);
        }

        


    }
}
