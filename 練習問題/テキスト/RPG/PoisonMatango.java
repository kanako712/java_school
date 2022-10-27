/*
 * ア、PoisonMatangoクラスは、お化けきのこ(Matango)の中でも特に「毒攻撃」ができる
 * イ、PoisonMatangoは以下のコードでインスタンス化できるクラス
 * 　　「PoisonMatango pm = new PoisonMatango('A');」
 * ウ、PoisonMatangoは毒を用いた攻撃が可能な残り回数をint型フィールドとして持ったおり、初期値は5
 * エ、PoisonMatangoはattackメソッドが呼ばれると次の内容の攻撃をする。
 * 　　①「お化けキノコ同様の攻撃」を行う
 * 　　②「毒攻撃の残り回数」が0でなければ、以下の追加を行う
 * 　　③画面に「さらに毒の胞子をばらまいた！」と表示
 * 　　④勇者のHPの1/5に相当するポイントを勇者のHPから引き、そのポイントを示すよう
 * 　　　「〜ポイントのダメージ！」と表示する。
 * 　　⑤「毒攻撃の残り回数」を1減らす。　　
*/

public class PoisonMatango extends Matango {//継承させる
int Dokukogeki = 5;//ア、ウ初期値設定

    public PoisonMatango(char suffix){//コンストラクタ作成
         super(suffix);//親の呼び出し、親クラスに引数入ってるから入れる
    }

    public void attack(Hero h){//エ　オーバーライド　上書き
        super.attack(h);//①親クラス呼ぶ

        if(Dokukogeki > 0){//②
            System.out.println("さらに毒の胞子をばらまいた！");//③
            int damezi = h.hero / 5;
            h.hero -= damezi;
            System.out.println(damezi+"ポイントダーメージ！");//④
            Dokukogeki--;//⑤
        }
    }

    
}
