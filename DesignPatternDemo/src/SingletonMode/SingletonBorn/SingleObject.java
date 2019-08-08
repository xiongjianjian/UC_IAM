package SingletonMode.SingletonBorn;

/**
 * @author xiongjianjian
 * @dte 2019/8/5 - 10:40
 */
public class SingleObject {
    private static SingleObject instance=new SingleObject();
    private SingleObject(){}
    public static SingleObject GetSingleObject(){
        return instance;
    }
    public void ShowMessage(){
        System.out.println("I am a "+this.getClass().getName());
    }
}
