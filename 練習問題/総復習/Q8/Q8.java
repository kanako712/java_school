/*
 * 以下の仕様に基づいてTyouhanクラスとMainクラスを作成してください。			
			
Tyouhanクラス			
	dectionメソッド		
		引数：	
			整数
		戻り値：	
			無し
		処理内容：	
			引数が丁（偶数）か半（奇数）かを判定して結果を表示します。
			
Mainクラス			
	mainメソッド		
		処理内容：	
			Tyouhanクラスのdectionメソッドを2回呼び出します。
			引数は1回目は「5」を、2回目は「12」を渡します。
 */

public class Q8 {  
    public static void main(String[] args){
		Tyouhan.dection(5);
		Tyouhan.dection(12);

    }
}
