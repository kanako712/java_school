public class Hero{
    String name = "ミナト"; //名前の宣言
    int hp = 100;//HPの宣言

    
    public void run(){
        System.out.println(this.name+"は、逃げ出した！");
    }

    public void attack(Matango m){
        System.out.println(this.name+"の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }
    
}