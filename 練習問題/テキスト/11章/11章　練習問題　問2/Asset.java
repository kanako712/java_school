/*
 * 問題11-1の会社では、形のない無形資産(IntangibleAsset)も管理しようと考えています。
 * 無形資産には、たとえば特許権(Patent)などがあります。無形資産も有形資産も
 * 資産(Asset)の一種です。この前提に従って、次の継承ツリーの(ア)(イ)(ウ)にあてはまるクラスを
 * 考えてください。
 * 　　　　　　　　　　　(ア)
 * 　　　　　　　　　　↗︎　　　↖︎
 * 　　　　TangibleAsset    (イ)
 *       　↗︎　　　　　　　　　　　　　↖︎
 * computer　　　　　　　　　　　　　(ウ)
 * 
 * 解答(ア)Asset(イ)IntangibleAsset(ウ)Patent
 * 
 * また、(ア)に入る抽象クラスを開発し、このクラスを継承するように
 * TangibleAssetを修正してください。
 */
public abstract class  Asset  {
        String name;
        int price;
        //コンストラクタ
        public Asset(String name,int price){
            this.name = name;
            this.price = price;
        }
        //メソッド
        public String getName(){return this.name;}
        public int getPrice(){return this.price;}
    
}
