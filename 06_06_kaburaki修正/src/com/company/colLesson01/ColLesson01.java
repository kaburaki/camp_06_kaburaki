package com.company.colLesson01;

import java.util.Scanner;

public class ColLesson01 {

    public static void main(String[] args) {

        Word[] words = new Word[10];

        System.out.println("わからなかった単語とその意味をスヘースで区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;
        while(!input.equals("e")) {
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0],tmp[1]);
            words[index] = wd;
            index++;
            System.out.println("次の単語と意味を入力して下さい。eで終了します。");
            input = sc.nextLine();

        }

        for (int i = 0;i < index; i++) {
            System.out.println("単語：" + words[i].word + " 意味：" + words[i].meaning);
        }

        System.out.println(index + "件、登録しました");


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("わからなかった単語とその意味をスヘースで区切って入力して下さい。");

//        while (true) {
//            //入力した単語と意味をinputに格納する。
//            String input = sc.nextLine();
//
//            // inputsにinputを単語と意味を分けて格納する。
//            String[] inputs = input.split(" ",2);
//
//            // Wordクラスに単語と意味を格納する。
//            //Word wo = new Word(inputs[0],inputs[1]);
//            Word wo = new Word();
//            wo.addWords(inputs[0],inputs[1]);
//
//            //終了条件について
//            System.out.println("次の単語と意味を入力して下さい。eで終了します。");
//
//            //もしeならば
//            if (input.equals("e")) {
//            //ワードの長さ分登録した単語を表示する。
//                for (int i = 0; i < wo.word.length; i++)
//                System.out.println("単語：" + wo.word[0] + " 意味：" + wo.meaning[0]);
//            //単語件数を表示する。。");
//                System.out.println(wo.word.length()+"件、登録しました
//
//            }
//        }
    }
}

