public class Cleric{
    String neme;
    int hp = 50;
    int mp = 10;
    final int HP = 50;
    final int MP = 10;

    public void selfAid(){
        this.mp -= 5;
        this.hp = 50;
        System.out.println("MPを5消費することでHPが最大になった！");
   }

   public void pray(int sec){
        this.mp += sec + new java.util.Random().nextInt(2);
        System.out.println("祈ったので"+this.mp+"MP回復した");


   }
}