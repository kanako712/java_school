/*
 * 9章で作った生物をあらわすCreatureクラスを継承して、		
    攻撃的な生命体を表す抽象クラス、Attackerクラスを作成してください。		
	①フィールドに攻撃力（attack）を持つ。アクセス修飾子は「private」とする。	
	②生命値、名前、攻撃力を設定できるコンストラクタを持つ。	
		引数なしコンストラクタ
		引数ありコンストラクタ（引数1つ・攻撃力を設定できるコンストラクタ）
		引数ありコンストラクタ（引数3つ・生命値、名前、攻撃力を設定できるコンストラクタ）	
	③攻撃力（attack）のアクセッサーを持つ。		
	④他の生命体を攻撃する抽象メソッド、void  attack（引数はAttacker型インスタンス）メソッドを持つ。	
 */


public abstract class Attacker extends Creature{
    /*❶フィールド・プライベート */
	private int attack;
	/*❷引数3つ　　　　　　　　 */
    public Attacker(String name,int seimeiti,int attack){
		super(name,seimeiti);
		this.attack = attack;
    }
	/*❷引数1つ　　　　　　　　 */
	public Attacker(int attack){
		this.attack = attack;
    }
	/*❷引数なし　　　　　　　　 *///コンストラクタ
	public Attacker(){
		super();//書かなくてもOK
    }
	/*❸アクセサattack　　　　　 */
	public int getAttack(){
		return this.attack;
	}
	public void setAttack(int attack){
		this.attack = attack;
	}

    /*❹攻撃する抽象メソッド　　 */
	public abstract void attack(Attacker attacker);
	
}
