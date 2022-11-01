
/*11章　練習1
 * ある会社では、会社の資産として保有するものを管理するプログラムを
   作ろうとしています。現時点では、「コンピュータ」「本」を表す、
    2つのプログラムがあります。
  
 * public class Book extends TangibleAsset {
    String name;
    int price;
    String color;
    String isbn;
    //コンストラクタ
    public Book(String name,int price,String color,String isbn){
        this.name = name;
        this.price = price;
        this.color = color;
        this.isbn = isbn;
    }
    //メソッド
    public String getIsbn(){return this.isbn;}
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
    public String getColor(){return this.color;}
}
*  public class Computer extends TangibleAsset{
    String name;
    int price;
    String color;
    String makerName;
    //コンストラクタ
    public Computer(String name,int price,String color,String makerName){
        this.name = name;
        this.price = price;
        this.color = color;
        this.makerName = makerName;
    }
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
    public String getColor(){return this.color;}
    public String getmakerName(){return this.makerName;}   
}
*　今後、コンピュータと本以外にも、さまざまな形ある資産を管理していきたい場合
    有用な「有形資産（TangibleAsset）」という名前の抽象クラス(継承の材料)
    を作成してください。また、ComputerやBookはそのクラスを用いた形に修正してください。
*/

public abstract class TangibleAsset extends Asset {
    String name;
    int price;
    String color;

    //コンストラクタ
    public TangibleAsset(String name,int price,String color){
        this.name = name;
        this.price = price;
        this.color = color;
       
    }
    
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
    public String getColor(){return this.color;}

}

    
