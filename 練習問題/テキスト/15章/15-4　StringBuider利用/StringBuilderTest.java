public class StringBuilderTest {
	public static void main(String[] args) {
		// 文字列結合メソッドを実行し、処理時間を変数に代入
		long plusTime = plusCombine();
		long sbTime = sbCombine();
		
		// 表示
		System.out.println("+演算子を使用した場合      :" + plusTime + " ms");
		System.out.println("StringBuilderを使用した場合:" + sbTime + " ms");
	}
	
	/**
	 * +演算子で文字列を結合
	 * @return 処理時間
	 */
	private static long plusCombine() {
		// 処理前の時刻を取得
		long startTime = System.currentTimeMillis();
		
		// +演算子で文字列を結合（従来の方法）
		String s = "";
		for (int i = 0; i < 10000; i++) {
			s += "java";
		}
		
		System.out.println(s);
		
		// 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	/**
	 * StringBuilderで文字列を結合
	 * @return 処理時間
	 */
	private static long sbCombine() {
		// 処理前の時刻を取得
		long startTime = System.currentTimeMillis();
		
		// +演算子で文字列を結合（従来の方法）
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("java");
		}
		
		System.out.println(sb.toString());
		
		// 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
}

