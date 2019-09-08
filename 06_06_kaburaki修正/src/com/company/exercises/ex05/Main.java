package com.company.exercises.ex05;
import com.company.exercises.Person;

public class Main {
    public static void main(String[] args) {

        Person morita = new Person("森田", "奈良");
        Person kimura = new Person("木村", "埼玉");
        Person takayama = new Person("高山", "東京");
        Person sigeki = new Person("茂木", "沖縄");

//        person.name ="kaburaki";
//        person.from ="CHiba";

        morita.getSelfIntroduction();
        kimura.getSelfIntroduction();
        takayama.getSelfIntroduction();
        sigeki.getSelfIntroduction();

    }
}