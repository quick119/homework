package com.train;

public class TicketJ {
    int tickets;
    int round_trip;

    public TicketJ(int tickets, int round_trip) {
        this.tickets = tickets;
        this.round_trip = round_trip;
    }

    private int total() {
        int price = 1000;
        float discount = 0.9f;
        int total = (tickets - round_trip)*price + (int)(round_trip*2*discount);
        return total;
    }
}
