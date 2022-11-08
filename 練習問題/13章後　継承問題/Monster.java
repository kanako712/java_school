/*
 * 3）1)で作成したAttackerクラスを継承して、Monsterクラスを作成してください。		
	①Monsterクラスは、インスタンスを作成するときに、名前・生命値・攻撃力を設定できる。	
	②Monsterクラスの、attackメソッドは、引数で渡された生物の生命値を減らすことができる。	
	減らす値は、攻撃値（任意の値を設定）に、ランダム値を掛けた整数とする。（攻撃力×0.0～1.0未満の乱数）		
 */
public class Monster extends Attacker {
    /*❶インスタンスを作成するときに、名前・生命値・攻撃力を設定 */
    public Monster(String name,int seimeiti,int attack){
    super(name,seimeiti,attack);
}

    /*❷attackメソッドは、引数で渡された生物の生命値を減らすことができる。			
	減らす値は、固定の攻撃値「5」に、ランダム値を掛けた整数とする。（攻撃力×0.0～1.0未満の乱数）*/ 
  public void attack(Attacker attacker){
    int r = (int)(this.getAttack()*Math.random());
    attacker.setSeimeiti(attacker.getSeimeiti() - r);
}


    
}
