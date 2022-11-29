import java.io.*;

public class Main {
    public static void main(String[] args){
        FileWriter fw = null;//nullをいれる
        try{
            fw = new FileWriter("data.txt");
            fw.write("hello!");
        }catch(Exception e){
            System.out.println("何らかの例外が発生しました");
        }finally{//実行されなくてもしてほしいこと
            if(fw != null){//ファイルの中身がnullでない時のみtry
                try{
                    fw.close();
                }catch(IOException e){
                ;//記述ない場合は；を書くとわかりやすい
                }
            }
        }
    }
}
