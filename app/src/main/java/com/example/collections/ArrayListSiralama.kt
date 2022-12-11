package com.example.collections

fun main() {
    val k1= Kisiler(1,"Ahmet")
    val k2= Kisiler(2,"Zeynep")
    val k3= Kisiler(3,"Berna")

    val kisilerArrayList = ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("Önce")

    for (k in kisilerArrayList){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Sayısal Küçükten Büyüğe")

    val siralamaArrayList1 = kisilerArrayList.sortedWith(compareBy{it.kisiNo})

    for (k in siralamaArrayList1){
        println("${k.kisiNo}-${k.kisiAd}")
    }

    println("Sayısal Büyükten Küçüğe")

    val siralamaArrayList2= kisilerArrayList.sortedWith(compareByDescending { it.kisiNo })

    for (k in siralamaArrayList2){
        println("${k.kisiNo}-${k.kisiAd}")
    }

    println("Harfsel Büyükten Küçüğe")

    val siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending { it.kisiAd })
    for (k in siralamaArrayList3){
        println("${k.kisiNo}-${k.kisiAd}")
    }
}