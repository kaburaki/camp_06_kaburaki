package com.company.practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Monster {

//    フィールド　＝　オブジェクトが持つデータ
//    public 全体公開　どこからでも呼び出せる
    public String name;
    public int hp;
    public String waza;
    public String type;

//    コントラクターを呼ぶ
    public Monster(){
        System.out.println("コンストラクターを呼ぶ");
    }

//    コンストラクタに値を入れる＊引数の数が違うか、形式が違えば複数作れる
    public Monster(String name, int hp,String type, String waza){
        this.name = name;
        this.hp = hp;
        this.type= type;
        this.waza= waza;
    }

    //    初期値設定
    public Monster(String name,String type, String waza){
        this.name = name;
        this.hp = 10;
        this.type= type;
        this.waza= waza;
    }

//    メソッド　＝　オブジェクトの処理
    public void attack(){
        System.out.println(this.name +"は"+ this.waza +  "を繰り出した！");
    }
}
