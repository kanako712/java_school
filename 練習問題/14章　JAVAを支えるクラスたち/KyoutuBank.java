public class KyoutuBank{
    /*フィールド：貯金残高を保持するintZandaka					
				　自分の氏名を保持するstrName	
				　誰が貯金箱を利用しているかの氏名を保持するstrAllName[]	
				（※どのフィールドを「静的」にする必要があるか、考えてみよう。）	 */
    private static int intZandaka; //残高
    private String strName; //名前
    private static String[] strAllName = new String[5];//利用者リスト　配列の書き方　型[]配列変数名 全員の名前いりだからstatic

    /*コンストラクタ：誰が貯金箱を利用するのか、氏名を設定できるコンストラクタ*/
    public KyoutuBank(String strName){
        this.setAllName(strName);//利用者リストに設定
        this.strName = strName;//名前を設定
    }
    /*メソッド:残高を参照するgetZandakaメソッド			
			  貯金をするためのsetZandakaメソッド*/
    public int getIntZandaka(){
        return this.intZandaka;
    }
    public void setIntZandaka(int intAmount){
        boolean isMember = false;
        for(String s : strAllName){
            if(this.strName.equals(s)){
                isMember = true;
                break;
            }
        }
        if(isMember){
            System.out.printLn(this.strName + "さんはメンバーではないので貯金できません");
            return;//メソッドから抜けることができる
        }
        /*貯金は最高で1万円までしかできない。それ以上は貯金箱に入らない。*/
        if(intAmonut + this.intZandaka >10000 ){
            System.out.println(this.StrName + "さんが"+ intAmount + "円貯金しようとしましたが・・・");
            System.out.println("残高の合計額が一万円を超える場合は入金できません");
        } 
        this.intZandaka = intZandaka;
    }	
	/*貯金を引き出すためのtakeZandakaメソッド */
    public void takeZandaka(int intAmount){
        if(setZandaka < 0){
            return setZandaka = 0;
         }

            
        return takeZandaka;
        this.setZandaka(this.getZandaka() - intAmount);
        System.out.println(this.strName + "さんが" + intAmount +"円引出");
        /*借金はできない…残高が0円の時はお金を引き出せない */
         
    }
    
    /*自分の名前を確認できるgetNameメソッド			
	  自分の名前を変更できるsetNameメソッド*/
      public String getStrName(){
        return this.strName;
    }
    public void setStrName(string strName){
        this.strName = strName;
    }	  
    /*貯金箱の利用者の全員の名前を表示するgetAllNameメソッド				
	  貯金箱の利用者に名前を登録するsetAllNameメソッド  */
      public String[] getStrAllName(){
        System.out.println(this.strName + "さんが利用者を確認");
        for (String s : strAllName){ //AllNameのに配列入れていく
            System.out.println(s);
        }
        return this.strAllName;
    }
    public void setStrAllName(String strName){
        for (int i = 0 ; i < this.strAllName.length ;i++)
            if(this.strAllName[i] == null){
                this.strAllName[i] = strName;
                break;
            }
            if 
        this.strAllName = strAllName;
    }	      
    /* 貯金箱の利用者数を表示するgetSizeメソッド */
    public int getSize(){
        System.out.println(this.strName + "さんが貯金箱の利用者数を確認");
        System.out.println(this.strName + "さんが貯金箱の利用者数を確認");
        return this.strAllName.length;
    }
    /* ＜システムのルール＞		
		借金はできない…残高が0円の時はお金を引き出せない。
		貯金は最高で1万円までしかできない。それ以上は貯金箱に入らない。
		お金の出し入れをするときは、必ず残高を確認したうえで行い、
		だれがいくら出し入れしたかを表示させること。
		貯金箱は最高で5人まで共同利用できる。*/
}