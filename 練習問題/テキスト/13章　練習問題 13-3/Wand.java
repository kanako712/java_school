
/*13-3 13-2で解答したエラーを解決するためにgetとsetを追加
//13-4 13-3で作成したWizard,wandクラスのsetメソッドについて
  引数の妥当性検証を追加、引数が妥当でない場合にはthrow new IllegalArgumentException
  を用いて何らかのエラーメッセージを表示し、プログラム中断する
  ①魔法使いや杖の名前には、3文字以上指定する。
  ②杖による増幅率は、0.5以上100以下である。
  ③魔法使いは必ず杖を装備する。
  ④魔法使いのHPとMPは0以上である。ただし、HPについては、負の値を
  　セットしようとした場合には、自動的に0が設定される。
*/

public class Wand {
   private String name; //杖の名前
   private double power; //杖の魔力

   public String getName(){//getメソッド
      return this.name;
   }

   public void setName(String name){//setメソッド
      if(name.length() < 3){//短かすぎ
         throw new IllegalArgumentException("名前が短かすぎる。処理を中断");
     }
     this.name = name;//検査完了。代入しても大丈夫
   
   }

   public double getPower(){//getメソッド
      return this.power;
   }

   public void setPower(double power){//setメソッド
      if(power < 0.5 || power > 100.0){//0.5以上100以下除く
         throw new IllegalArgumentException("増幅率がおかしい。処理を中断");
     }
      this.power = power;//検査完了。代入しても大丈夫
   }
}
