/**
 * 名前を入力し表示するクラス
 * @author 都築　璃麗
 * @version 2022/12/06
 */

public class Name {
    private String name;

    public Name(String name){
        this.name = name ;
    }

    /**
     * getterメソッド
     * @param getName
     */ 
    public String getName(){
        
        return this.name;
    }
    /**
     * setterメソッド
     * @param setName
     */ 
    public void setName(String name){
        this.name = name; 
    }

    /**
     * Enterメソッド
     * @param Enter
     */ 
    public static void Enter(){
        String enter = new java.util.Scanner(System.in).nextLine();
    }


}
    
    