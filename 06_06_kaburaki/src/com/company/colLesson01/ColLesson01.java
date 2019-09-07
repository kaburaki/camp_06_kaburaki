package com.company.colLesson01;

import java.util.Scanner;

public class ColLesson01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("わからなかった単語とその意味をスヘースで区切って入力して下さい。");

        while (true) {
            //入力した単語と意味をinputに格納する。
            String input = sc.nextLine();

            // inputsにinputを単語と意味を分けて格納する。
            String[] inputs = input.split(" ",2);

            // Wordクラスに単語と意味を格納する。
            //Word wo = new Word(inputs[0],inputs[1]);
            Word wo = new Word();
            wo.addWords(inputs[0],inputs[1]);

            //終了条件について
            System.out.println("次の単語と意味を入力して下さい。eで終了します。");

            //もしeならば
            if (input.equals("e")) {
            //ワードの長さ分登録した単語を表示する。
                for (int i = 0; i < wo.word.length; i++)
                System.out.println("単語：" + wo.word[0] + " 意味：" + wo.meaning[0]);
            //単語件数を表示する。
//                System.out.println(wo.word.length()+"件、登録しました。");

            }
        }
    }
}

