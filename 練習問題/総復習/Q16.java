/*
 * 配布フォルダ内のQ16.javaをダウンロードしてください。	
   生徒の名前とテストの点数をMapに格納し、入力された人物の点数を表示するようにしたいです。	
   メインメソッド内に処理を追加して、正しく動作するように編集してください。	
   ただし、編集禁止と記述されている箇所は変更しないでください。	
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q16 {
	public static void main(String[] args) {
		// 生徒と点数を格納するマップをインスタンス化
		Map<String, Integer> studentsMap = new HashMap<>();
		// 生徒の苗字をキー、点数を値として格納
		studentsMap.put("坂本", 75);
		studentsMap.put("長野", 82);
		studentsMap.put("井ノ原", 65);
		studentsMap.put("森田", 55);
		studentsMap.put("三宅", 56);
		studentsMap.put("岡田", 91);
		
		System.out.println("点数を確認したい生徒の苗字を入力");
		
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
			String name = reader.readLine();
			// ↑ここまで編集禁止
			// ↓に処理を記述------------------------------------
			if(studentsMap.containsKey(name)){
				int value = studentsMap.get(name);
				System.out.println(name+"さんの点数は"+value+"点です");

			}else if(name.isEmpty()){
				System.out.println("文字の入力がありません");

			}else{
				System.out.println(name+"さんは存在しません");
			}	
			
			// ↑に処理を記述------------------------------------
			// ↓ここから編集禁止
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}


/*for (String key:studentsMap.keySet()){
			int value = studentsMap.get(key);
				if(key.equals(name) == true){
				System.out.println(key+"さんの点数は"+value+"点です");
				return;
				}
			}
            for (String key:studentsMap.keySet()){
			int value = studentsMap.get(key);
				if(key.equals(name) == false){
				System.out.println(name+"さんは存在しません");
				return;
				}
			}*/