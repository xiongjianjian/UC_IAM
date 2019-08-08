package FactoryMode.FactoryDemoTest;

import FactoryMode.Factory.Factory;
import FactoryMode.FactoryInterface.Shape;

/**
 * @author xiongjianjian
 * @dte 2019/8/5 - 10:24
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory fac=new Factory();
        Shape triangle= (Shape) fac.CreateShape("Triangle");
        triangle.configure();
    }
}
