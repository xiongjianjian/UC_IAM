package FactoryMode.Factory;

import FactoryMode.Entity.Circle;
import FactoryMode.Entity.Quad;
import FactoryMode.Entity.Triangle;

/**
 * @author xiongjianjian
 * @dte 2019/8/5 - 10:20
 */
public class Factory {
    public Object CreateShape(String obj){
        if (obj == null) {
            return null;
        }
        if(obj.equalsIgnoreCase("Triangle")){
            return  new Triangle();
        }
        if(obj.equalsIgnoreCase("Quad")){
            return  new Quad();
        }
        if(obj.equalsIgnoreCase("Circle")){
            return  new Circle();
        }
        return null;
    }
}
