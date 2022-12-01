/*
 * 以下のようなMainクラスとHeroクラスを作成してください。				
				
Heroクラス				
	フィールド			
		HP：整数型（初期値「15」）		
		名前：文字列型（初期値「たなか」）		
				
Mainクラス				
	mainメソッド			
		処理内容：		
			Heroクラスをインスタンス化します。	
			その後、Heroの名前HPをそれぞれ表示します。	
 */
public class Main {
    public static void main(String[] args){
        //Heroクラスをインスタンス化します。
        Hero h = new Hero();
        System.out.println("名前："+h.name);
        System.out.println("HP："+h.hp);

    }
}
