package com.company;

import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

//        スキャナー定義
        Scanner scanner = new Scanner(System.in);

//        回答ボックス定義
        int[] ansswers;
        ansswers = new int[5];

//        質問の設定
        String tool = "私とあなたの相性を診断します。５つの質問に答えて下さい！";
        String[] qestion1 = {"一人で飲むより友達と飲むほうが好きだ","漫画をよく読むほうだ", "朝起きが得意だ"};
        String[] qestion2 = {"子供が好きだ","意見ははっきり伝えるほうだ","SNSはあまりやらないほうだ"};
        String[] qestion3 = {"コーヒーにはミルクを入れるほうだ","朝ごはんは欠かさず食べるほうだ","中華料理が好き"};
        String[] qestion4 = {"犬が好きだ","猫が好きだ","うさぎが好きだ"};
        String[] qestion5 = {"朝食はパン派だ","夜９時以降は炭水化物を取らないほうだ","睡眠時間は６時間以上が多い"};
        String select = "1 全然違う　２ 少し違う　３どちらとも言えない　4少しそう思う　５とてもそう思う";

//        質問１
        System.out.println(tool);

        Random rondom1 = new Random();{
            String que1 = qestion1[rondom1.nextInt(2)];
            System.out.println("問1 "+ que1);
        }

        System.out.println(select);

//        回答１
        int input1 = scanner.nextInt();

        if (input1 < 6) {
            ansswers[0] = input1;
            } else {
            // メソッドを終了
            System.exit(0);
        }

//        質問２
        Random rondom2 = new Random();{
            String que2 = qestion2[rondom2.nextInt(2)];
            System.out.println("問2"+ que2);
        }
        System.out.println(select);

//        回答２
        int input2 = scanner.nextInt();

        if (input2 < 6) {
            ansswers[1] = input2;
            } else {
            // メソッドを終了
            System.exit(0);
        }

//        質問３
        Random rondom3 = new Random();{
            String que3 = qestion3[rondom3.nextInt(2)];
            System.out.println("問3"+ que3);
        }
        System.out.println(select);

//        回答３
        int input3 = scanner.nextInt();

        if (input3 < 6) {
            ansswers[2] = input3;
            } else {
            // メソッドを終了
            System.exit(0);
        }

//        質問４
        Random rondom4 = new Random();{
            String que4 = qestion4[rondom4.nextInt(2)];
            System.out.println("問4"+ que4);
        }
        System.out.println(select);

//        回答４
        int input4 = scanner.nextInt();

        if (input4 < 6) {
            ansswers[3] = input4;
            } else {
            // メソッドを終了
            System.exit(0);
        }

//        質問５
        Random rondom5 = new Random();{
            String que5 = qestion5[rondom5.nextInt(2)];
            System.out.println("問5"+ que5);
        }
        System.out.println(select);

//        回答５
        int input5 = scanner.nextInt();

        if (input5 < 6) {
            ansswers[4] = input5;
            } else {
            // メソッドを終了
            System.exit(0);
        }

//        結果
        String kekka = "結果発表！！！";
        System.out.println(kekka);

//        合計計算
        int sum = 0;
        for( int i=0; i<ansswers.length; i++ ) {
            sum += ansswers[i];
        }
//        結果判定
        if (sum == 5) {
            System.out.println("相性は最悪です。");
        } else if(sum  >= 6 && sum <= 10){
            System.out.println("相性はまあまあです。");
        } else if(sum  >= 11 && sum <= 15){
            System.out.println("相性はなんともいえないです。");
        } else if(sum  >= 16 && sum <= 20){
            System.out.println("相性は良いです。");
        } else if(sum  >= 21 && sum <= 24){
            System.out.println("相性は最高です。");
        } else if(sum  == 25){
            System.out.println("相性は最高です。もしかして私が答えましたか？");
        }


    }

}


//        for (int i = 0; i < qestion.length; i++) {
//            System.out.println(qestion[i]);
//        }
//
//        for (int i = 0; i < qestion.length; i++)
//            for (int j = 0; j < qestion.length; j++) {
//                String[] input = scanner.next(j);
//            }
//            System.out.println(qestion[i]);
//



//        for (int i ; i >5 ;i++) {
//            String input = scanner.next();
//            System.out.println(input);
//
//        Random random = new Random(); //ランダム表示　
//        int n =random.nextInt(10);
//        System.out.println(n);
