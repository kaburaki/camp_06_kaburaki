package com.company.exercises;

public class Person {

        public String name;
        public String from;

    public Person(){
            this.name = "鏑木";
            this.from = "千葉";
        }

    public Person(String name,String from){
            this.name = name;
            this.from = from;
        }

        public void getSelfIntroduction() {
            System.out.println(
                    "私の名前􏰁は"+name+"です。"+ from +"出身です");
        }
}
