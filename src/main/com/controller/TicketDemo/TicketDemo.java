package controller.TicketDemo;

public class TicketDemo {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        Thread t0 = new Thread(tickets);
        Thread t1 = new Thread(tickets);
        Thread t2 = new Thread(tickets);
        t0.start();
        t1.start();
        t2.start();
    }
}
