package com.example.collections

fun main() {


    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler)
    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.last())

    println(meyveler.contains("Kiraz")) // KİRAZ diye bir veri var "True"
    println(meyveler.contains("Kira"))  // KİRA diye bir veri yok "False"

    println(meyveler.max())
    println(meyveler.min())

    meyveler.sort()
    println(meyveler)
    println(meyveler.toString())

    println(meyveler.reverse())
    println(meyveler.toString())
    println(meyveler)


    meyveler.removeAt(3)
    println(meyveler.toString())

    meyveler.remove("Kivi")
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())

    println(meyveler.isEmpty())

}