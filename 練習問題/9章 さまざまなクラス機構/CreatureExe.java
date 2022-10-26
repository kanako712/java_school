/*
9章　3）
2）で作成した Creatureクラスのインスタンスを複数作成し、
それぞれの名前、生命値を表示する実行クラスを作成してください。
 */
public class CreatureExe {
    public static void main(String[] args) {

        //1.インスタンスを生成
        Creature c1 = new Creature("犬",25);
        System.out.print(c1.name);
        System.out.println("の生命値は"+c1.seimeiti);

        Creature c2 = new Creature("猫");
        System.out.print(c2.name);
        System.out.println("の生命値は"+c2.seimeiti);

        Creature c3 = new Creature(15);
        System.out.print(c3.name);
        System.out.println("の生命値は"+c3.seimeiti);

        Creature c4 = new Creature();
        System.out.print(c4.name);
        System.out.println("の生命値は"+c4.seimeiti);
    }
    
}
