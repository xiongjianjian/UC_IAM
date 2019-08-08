package FactoryMode.Entity;

import FactoryMode.FactoryInterface.Shape;

/**
 * @author xiongjianjian
 * @dte 2019/8/5 - 10:17
 */
public class Quad implements Shape {
    @Override
    public void configure() {
        System.out.println("I am a "+this.getClass().getName());
    }
}
