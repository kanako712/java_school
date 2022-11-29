public class Tesuto {
    public static void main (String[] args){
        int heroHp = 100;
        
        Hero h1 = new Hero();
        h1.name = "スズキ";
        h1.hp = heroHp;//値渡し（コピーを生成）100＝100；

        heroHp = 200;//3行目の方だけ200代入された

        Hero h2 = h1;//参照渡し　h1もh2も同じ箱をさす　h2＝スズキ：100；
        h2.name = "ヤスダ";// ヤスダ：100；に変更される。

        System.out.print(h1.name);//同じ箱だから、12行目のヤスダ
        System.out.print(h1.hp);//11行目がそのままくる


    }
}
