
public class Main {
    public static void main(String[] args) {
        
        Wizard w = new Wizard();
        w.setName("夏菜子");      //String name = null
                            //h.setName(name);だとnullになる     
        Wand wand = new Wand();
        w.setWand(wand);//クラス型引数、渡す
        wand.setName("まほうの杖");
        System.out.println(w.getWand().getName());           
    }

}
