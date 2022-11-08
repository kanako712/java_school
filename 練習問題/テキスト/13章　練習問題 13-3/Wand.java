
/*13-3 13-2で解答したエラーを解決するためにgetとsetを追加*/

public class Wand {
   private String name; //杖の名前
   private double power; //杖の魔力

   public String getName(){//getメソッド
      return this.name;
   }
   public void setName(String name){//setメソッド
     this.name = name;
   }

   public double getPower(){//getメソッド
      return this.power;
   }
   public void setPower(double power){//setメソッド
      this.power = power;
   }
}
