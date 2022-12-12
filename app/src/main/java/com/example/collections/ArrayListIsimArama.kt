package com.example.collections

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    var isimler = ArrayList<String>()

    isimler.add("Ahmet")
    isimler.add("Mehmet")
    isimler.add("Zeynep")
    isimler.add("Sedat")
    isimler.add("Ercan")

    println("Aratmak için isim giriniz:")
    val isim = girdi.next()

    for (i in isimler){
        if (i == isim){
            println("İSİM MEVCUT")
            break
        }
        else{
            println("İSİM MEVCUT DEĞİL")
            break
        }
    }

}

