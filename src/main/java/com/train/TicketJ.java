package com.train;

public class TicketJ {
    int tickets;
    int roundTrip;
    int total;

    public TicketJ(int tickets, int roundTrip) {
        this.tickets = tickets;
        this.roundTrip = roundTrip;
    }

    public int total() {
        int price = 1000;
        float discount = 0.9f;
        int total = (tickets - roundTrip)*price + (int)(roundTrip*2*price*discount);
        return total;
    }

    public void print() {
        System.out.println("Total tickets: " + tickets + "\n"
                + "Round-trip: " + roundTrip + "\n"
                + "Total: " + total());
    }
}
