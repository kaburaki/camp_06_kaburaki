package com.company.colLesson01;

    public class Word {

    //フィールドを定義
    public String[] word = new String[10];
    public String[] meaning = new String[10];

    //  コンストラクタ

//    public Word(String wordinput,String meaninginput){
//        this.word = wordinput;
//        this.meaning = meaninginput;
//         }
        public Word(){}
        public void addWords(String wordinput,String meaninginput){
        this.word[0] = wordinput;
        this.meaning[0] = meaninginput;
        }

    // メソッド

//    public void getWords() {
//        System.out.println("単語：" + word[0] + " 意味：" + meaning[0]);
//    }
//    public void Wordsnum() {
//            System.out.println(word.length()+"件、登録しました。");
//    }

    }
