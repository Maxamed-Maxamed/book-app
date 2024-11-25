package org.example

import kotlin.system.exitProcess
import java.lang.System.exit

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    runMenu()

    
}

fun mainMenu() : Int {
    println("")
    println("--------------------")
    println("Book KEEPER APP")
    println("--------------------")
    println("book MENU")
    println("  1) Add a book")
    println("  2) List all book")
    println("  3) Update a book")
    println("  4) Delete a book")
    println("--------------------")
    println("  0) Exit")
    println("--------------------")
    print("==>> ")
    return readlnOrNull()?.toIntOrNull() ?: -1
}

fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1  -> addbook()
            2  -> listbooks()
            3  -> updatebook()
            4  -> deletebook()
            0  -> exitApp()
            else -> println("Invalid option entered: " + option)
        }
    } while (true)
}

fun exitApp() {
    println("Goodbye!")
    exitProcess(0)
}

fun addbook(){
    println("You chose Add book")
}

fun listbooks(){
    println("You chose List books")
}

fun updatebook(){
    println("You chose Update book")
}

fun deletebook(){
    println("You chose Delete book")
}
