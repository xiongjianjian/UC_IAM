package entity;

import BuyTickets.BuyTickets;

/**
 * @author xiongjianjian
 * @dte 2019/8/5 - 16:29
 */
public class Tickets implements BuyTickets {
    private String tickets;
    private double price;
    private  int num;
    public Tickets(String tickets,double price,int num){
        this.tickets = tickets;
        this.price = price;
        this.num = num;
        getPrice();
    }
    @Override
    public void printTickets() {
        System.out.println("tickets is "+this.tickets);
        System.out.println("price is "+this.price);

    }
    private void getPrice(){
        System.out.println("price is "+this.price*this.num);
    }
}
