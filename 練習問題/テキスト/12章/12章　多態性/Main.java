public class Main{
    public static void main(String[] args) {

         //1.勇者を生成
        Wizard w = new Wizard();
        Matango m = new Matango();

        //2.フィールドに初期値をセット
        w.name = "アサカ";
        
        //冒険のはじまり
        w.attack(m);
        w.fireball(m);
   }
}

