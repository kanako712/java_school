/* ＊＊＊＊＊先生の回答＊＊＊＊
 * 【class FindIndex】　※String型のメソッドを使います。		
	コマンドライン引数に2つの文字列を指定し、1番目に指定された文字列の中に2番目に指定された文字列が存在する場合は、		
	「この文字列はあります。（●文字目）」と表示し、		
	存在しない場合は、		
	「この文字列は存在しません」と表示してください。		
	入力文字数は、1番目の文字列は10文字以上とし、2番目の文字列は2文字以上4文字以内とする。		
	文字列の入力には、コマンドライン引数を使ってください。		
	また、文字列は先頭から検索し、最初に見つかった文字のインデックス（位置番号）を表示することとする。		
	実行例：	> Java FindIndex  明日は雨が降るそうです。　雨が降る
			   > この文字列はあります。（4文字目）
			   >Java FindIndex  明日は雨が降るそうです。　雪が降る
			   > この文字列は存在しません
*/


public class FindIndex1 {
	public static void main(String[] args) {
        String text1 = args[0];
        String text2 = args[1];
     	//①は10文字以上
        if(text1.length() >= 10){
            //②は2文字以上4文字以内       	
			if(2 <= text2.length() || text2.length() >=4 ){
                 //①に②が存在するかチェック    
                if(text1.contains(text2)){
                    //存在した場合
                    System.out.println("("+text1+")に("+text2+")はあります。("+text1.indexOf(text2)+"文字目)");
                }else{
                    System.out.println("("+text1+")に("+text2+")は存在しません");
                }
            }else{
						System.out.println("10文字以上ではありませんでした。");
			}
        }else{
					System.out.println("2文字以上4文字以内ではありませんでした。");
	    }
	}

}
