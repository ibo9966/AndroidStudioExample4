package com.example.collections

import kotlin.random.Random

fun main() {

    val sayilar = ArrayList<Int>()

    for (i in 1..100){
        val rasgeleSayi= Random.nextInt(0,101)
        sayilar.add(rasgeleSayi)
    }
    sayilar.sort()

    for (s in sayilar){
        println(s)
    }

}