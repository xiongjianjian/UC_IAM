package ProxyDemo;

import BuyTickets.BuyTickets;
import Proxy.ProxyDemo;

/**
 * @author xiongjianjian
 * @dte 2019/8/5 - 16:49
 */
public class TestMain {
    public static void main(String[] args) {
        BuyTickets buyTickets = new ProxyDemo("深圳-》南昌",200.0,2);
        buyTickets.printTickets();
    }
}
