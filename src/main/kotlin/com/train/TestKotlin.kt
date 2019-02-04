package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var round_trip = scanner.nextInt()
    val tic = Ticket(tickets, round_trip)
    tic.print()
}

class Ticket(var tickets: Int, var roundTrip: Int) {
    var round = (roundTrip * 2000 * 0.9f).toInt()
    var single = tickets - roundTrip
    var total =  single * 1000 + round

    fun print() {
        println("Total tickets: " + tickets + "\n"
                + "Round-trip: " + roundTrip + "\n"
                + "Total: " + total)
    }
}