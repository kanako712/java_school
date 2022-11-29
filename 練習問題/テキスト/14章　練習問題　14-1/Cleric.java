/*
 * 練習14-2
 * 第8章の練習問題で作成したClericクラスでは、各インスタンスごとに最大
 * HPと最大MPの情報を保持しています。しかし、すべてのCrericの最大HPは
 * 50、最大MPは10と決まっており、各インスタンスがそれぞれ情報を持たずに
 * 済むように改良したいと考えています。そこで、最大HP、最大MPのフィールド
 * が各インスタンスに保持されないよう、フィールド宣言に適切なキーワードを
 * 追加してください。
 */
public class Cleric{
    String name;
    int hp = 50;
    int mp = 10;
    static final int MAXHP = 50;//staticをつける
    static final int MAXMP = 10;//staticをつける

    public void selfAid(){
        this.mp -= 5;
        this.hp = this.MAXHP;
        System.out.println("MPを5消費することで"+this.mp+"になり、HPが最大の"+this.MAXHP+"になった！");
   }

   public int pray(int sec){
        int kaihuku= sec + new java.util.Random().nextInt(3);
        int kaihuku2 = Math.min(this.MAXMP - this.mp,kaihuku);
        //マックスから今のMP引いて、マックスを越えないようにしている。
        //(MAXMP=10)-mp(今のmp引く)=回復最大値、今回のランダム最大値を比較。

        this.mp += kaihuku2;
         //実際の回復量を足す

        System.out.println(sec+"秒、祈ったので"+kaihuku2+"MP回復し"+this.mp+"MPになった！");

        return kaihuku2;

   }
}