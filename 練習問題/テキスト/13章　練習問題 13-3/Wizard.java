//13-3 13-2で解答したエラーを解決するためにgetとsetを追加
/*//13-4 13-3で作成したWizard,wandクラスのsetメソッドについて
  引数の妥当性検証を追加、引数が妥当でない場合にはthrow new IllegalArgumentException
  を用いて何らかのエラーメッセージを表示し、プログラム中断する
  ①魔法使いや杖の名前には、3文字以上指定する。
  ②杖による増幅率は、0.5以上100以下である。
  ③魔法使いは必ず杖を装備する。
  ④魔法使いのHPとMPは0以上である。ただし、HPについては、負の値を
  　セットしようとした場合には、自動的に0が設定される。
*/

public class Wizard {
   private String name;
   private int hp;
   private int mp;
   private Wand wand;

   public String getName(){//getメソッド
    return this.name;
 }
 public void setName(String name){//setメソッド
    if(name.length() < 3){//短かすぎ
        throw new IllegalArgumentException("名前が短かすぎる。処理を中断");
    }
    this.name = name;
 }

 public int getHp(){//getメソッド
    return this.hp;
 }
 public void setHp(int hp){//setメソッド
    if(hp < 0){//④HPが0より小さい
        this.hp = 0;
    }
    this.hp = hp;
 }

 public int getMp(){//getメソッド
    return this.mp;
 }
 public void setMp(int mp){//setメソッド
    if(mp < 0){//④HPが0より小さい
        throw new IllegalArgumentException("HPがない。処理を中断");
    }   
    this.mp = mp;
 }

 public Wand getWand(){//getメソッド
    return this.wand;
 }
 public void setWand(Wand wand){//setメソッド
    if(wand == null){//③杖持ってない　
        throw new IllegalArgumentException("杖がない。処理を中断");
    }
    this.wand = wand;
 }

   public void heal(Hero h){
        int basePoint = 10;  //基本回復ポイント
        int recovPoint = (int)(basePoint * this.getwand.getpower); //杖による増幅
        h.setHp(h.getHp() + recovPoint);//勇者のHPを回復する
        System.out.println(h.getName+"のHPを"+recovPoint+"回復した！");
    }  

}
