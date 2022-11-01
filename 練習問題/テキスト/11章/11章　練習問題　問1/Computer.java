/*
 * 11章　①の解答
 */

public class Computer extends TangibleAsset{
    String makerName;

    //コンストラクタ
    public Computer(String name,int price,String color,String makerName){
        super(name,price,color);
        this.makerName = makerName;
    }
    
    public String getmakerName(){return this.makerName;}
    
}
