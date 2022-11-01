/*
 * 資産かどうかとは関わりなく、形ある物(Thing)であれば、
 * 「重さ」を得ることができるはずです。
 * そこで、double型の重さを取得するメソッドgetWeight()と
 * double型の重さを設定するメソッドsetWeight()を持つインタフェース
 * Thingを定義してください。
 */
public interface Thing {
    //フィールド持たない

    //コンストラクタ
    public Thing(){

    }

   //メソッド
    public double setWeight(){return this.name;}
    
}
