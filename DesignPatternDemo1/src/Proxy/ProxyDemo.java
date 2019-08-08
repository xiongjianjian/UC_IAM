package Proxy;

import BuyTickets.BuyTickets;
import entity.Tickets;

/**
 * @author xiongjianjian
 * @dte 2019/8/5 - 16:30
 */
public class ProxyDemo implements BuyTickets {
    private Tickets ticketsInstance;
    private static String tickets;
    private static double price;
    private static int num;
    public ProxyDemo(String tickets,double price,int num){
        this.tickets = tickets;
        this.price = price;
        this.num = num;
        System.out.println("ProxyDemo = " + this.getClass().getName());

    }
    @Override
    public void printTickets() {
        if (ticketsInstance == null) {
            ticketsInstance = new Tickets(tickets,price,num);
        }
        ticketsInstance.printTickets();
    }

}
