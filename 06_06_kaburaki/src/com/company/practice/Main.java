package com.company.practice;

public class Main {
    public static void main(String[] args) {

//        Monster pikachu = new Monster();
//        pikachu.name ="ピカチュウ";
//        pikachu.hp= 10;
//        pikachu.type ="でんき";
//        pikachu.waza ="でんこうせっか";

//        コンストラクターで設定した場合
        Monster pikachu = new Monster("ピカチュウ",10,"でんき","でんこうせっか");

        Monster hitokage = new Monster("ヒトカゲ",20,"とかげポケモン","ひのこ");

//        System.out.println(pikachu.name);
        pikachu.attack();
        hitokage.attack();
    }
}
