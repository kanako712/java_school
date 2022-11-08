/*2）1)で作成したAttackerクラスを継承して、Humanクラスを作成してください。				
	①Humanクラスは、インスタンスを作成するときに、名前を設定できる。			
	②Humanクラスの生命値は、固定値で20			
	    Humanクラスの攻撃値は、固定値で5			
	③Humanクラスの、attackメソッドは、引数で渡された生物の生命値を減らすことができる。			
		減らす値は、固定の攻撃値「5」に、ランダム値を掛けた整数とする。（攻撃力×0.0～1.0未満の乱数）		
					
		引数で渡された生物の生命値を減らす　とは・・・	
		相手の現在の生命値から、攻撃値をマイナスする　→　残った生命値を相手の生命値にsetする。
		（※ここむずかしいかも・・・。）
*/
/* Attackerクラスを継承して、Humanクラスを作成*/
public class Human extends Attacker {

/*❶インスタンスを作成するときに、名前を設定*/ //コンストラクタで名前設定
  public Human(String name){
    /*❷Humanクラスの生命値は、固定値で20、攻撃値は、固定値で5*/ 
    super(name,20,5);
  }

  /*❸attackメソッドは、引数で渡された生物の生命値を減らすことができる。			
	減らす値は、固定の攻撃値「5」に、ランダム値を掛けた整数とする。（攻撃力×0.0～1.0未満の乱数）*/ 
  public void attack(Attacker attacker){
        int r = new java.util.Random().nextInt(2);
        r * 5 = attackRandom;
        attacker.setSeimeiti(attacker.getSeimeiti() - attackRandom);
  }
  
  
}
