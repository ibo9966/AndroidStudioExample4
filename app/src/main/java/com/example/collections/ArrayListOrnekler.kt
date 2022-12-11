package com.example.collections

fun main() {

    val liste= ArrayList<String>()

    val liste2: ArrayList<Int> = ArrayList<Int>()

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.toString())
    println(meyveler)

    val str = meyveler.get(2)
    println(str)

    val str1 = meyveler.get(4)
    println(str1)

    val str2 = meyveler.get(0)
    println(str2)

    meyveler. add("Mandalina")
    println(meyveler.toString())
    println(meyveler)

    meyveler[2]="Ananas"
    println(meyveler.toString())
    println(meyveler)

    meyveler.add(3,"portakal") // VERİLERİ SİLMEDEN SAĞA DOĞR KAYDIRDI. 3. index PORTAKAL OLDU . Kivi 4. index oldu
    println(meyveler.toString())
    println(meyveler)
}