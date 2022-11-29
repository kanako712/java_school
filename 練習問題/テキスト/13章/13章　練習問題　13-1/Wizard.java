
public class Wizard {
   private String name;//すべてプライベートつける
   private int hp;//すべてプライベートつける
   private int mp;//すべてプライベートつける
   private Wand wand;//すべてプライベートつける

   public void heal(Hero h);{//パブリックつける
        int basePoint = 10;  //基本回復ポイント
        int recovPoint = (int)(basePoint * this.wand.power); //杖による増幅
        h.setHp(h.getHp() + recovPoint);//勇者のHPを回復する
        System.out.println(h.getName+"のHPを"+recovPoint+"回復した！");
    }  

}

