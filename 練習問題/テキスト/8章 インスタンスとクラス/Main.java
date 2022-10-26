public class Main{
    public static void main(String[] args) {

        //1.勇者を生成
        Cleric h = new Cleric();

       //2.フィールドに初期値をセット
       h.name = "ミナト";
       
       //冒険のはじまり
      h.selfAid();
      h.pray(2);
     
    }
}