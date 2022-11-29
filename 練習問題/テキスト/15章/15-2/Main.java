

/*15-2 文字列検索メソッドを利用した例 */
public class Main {
    public static void main(String[] args){
        String s1 = "Java and JavaScript";
        if(s1.contains("Java")){
            System.out.println("文字列はs1はJavaを含んでいます");
        }
        if(s1.endsWith("Java")){
            System.out.println("文字列はs1はJavaが末尾にあります");
        }
        System.out.println("文字列s1で最初にJavaが登場する位ちは" + s1.indexOf("Java"));
        System.out.println("文字列s1で最後にJavaが登場する位ちは" + s1.lastIndexOf("Java"));
        }
    }