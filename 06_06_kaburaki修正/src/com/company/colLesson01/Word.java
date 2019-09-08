package com.company.colLesson01;

    public class Word {

    public String word ;
    public String meaning ;

    public Word(){
    }

    public Word(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
     }

     public String toString(){
        return "単語：" + this.word + " 意味：" + this.meaning ;
     }

//    //フィールドを定義
//    public String[] word = new String[10];
//    public String[] meaning = new String[10];

    //  コンストラクタ

//    public Word(String wordinput,String meaninginput){
//        this.word = wordinput;
//        this.meaning = meaninginput;
//         }
//        public Word(){}
//        public void addWords(String wordinput,String meaninginput){
//        this.word[0] = wordinput;
//        this.meaning[0] = meaninginput;
//        }

    // メソッド

//    public void getWords() {
//        System.out.println("単語：" + word[0] + " 意味：" + meaning[0]);
//    }
//    public void Wordsnum() {
//            System.out.println(word.length()+"件、登録しました。");
//    }

    }
