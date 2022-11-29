public class Account {//accountインスタンスだからクラス名
    String accountNumber;
    int balance;

    public String toString(){
        return "¥¥"+ this.balance +"(口座番号:" + accountNumber +")"; 
    //表示①
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o instanceof Account){//もしaccount型でよければaccountへ
            Account a =(Account)o;
            String an1 = this.accountNumber.trim();//前後の半角が消える.trim()
            String an2 = a.accountNumber.trim();//前後の半角が消える.trim()
            if (an1.equals(an2)){
                return true;

            }
        }
        return false;
    }
 }
    
