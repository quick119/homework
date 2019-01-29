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

class Ticket(var tickets: Int, var round_trip: Int) {
    var round = (round_trip * 2000 * 0.9f).toInt()
    var single = tickets - round_trip
    var total =  single * 1000 + round

    fun print() {
        println("Total tickets: " + tickets + "\n"
                + "Round-trip: " + round_trip + "\n"
                + "Total: " + total)
    }
}