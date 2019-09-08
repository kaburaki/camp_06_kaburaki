package com.company.colLesson01;

import com.sun.org.apache.xpath.internal.compiler.Keywords;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {

    public static void main(String[] args) {

        ArrayList<Word> words = new ArrayList<>();

        System.out.println("わからなかった単語とその意味をスヘースで区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;
        while (!input.equals("e")) {
            try {

                String[] tmp = input.split(" ");
                Word wd = new Word(tmp[0], tmp[1]);
                words.add(wd);
                index++;
                System.out.println("次の単語と意味を入力して下さい。eで終了します。");
                input = sc.nextLine();

            } catch (IndexOutOfBoundsException e) {
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                break;
            }

        }

        for (int i = 0; i < index; i++) {
            System.out.println(words.get(i));
        }

        System.out.println(words.size() + "件、登録しました");

    }

}
