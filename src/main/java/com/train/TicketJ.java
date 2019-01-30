package com.train;

public class TicketJ {
    int tickets;
    int round_trip;
    int total;

    public TicketJ(int tickets, int round_trip) {
        this.tickets = tickets;
        this.round_trip = round_trip;
    }

    public int total() {
        int price = 1000;
        float discount = 0.9f;
        int total = (tickets - round_trip)*price + (int)(round_trip*2*price*discount);
        return total;
    }

    public void print() {
        System.out.println("Total tickets: " + tickets + "\n"
                + "Round-trip: " + round_trip + "\n"
                + "Total: " + total());
    }
}
