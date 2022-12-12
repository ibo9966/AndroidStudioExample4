package com.example.collections

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    var sayac=1

    val ogrenciler=ArrayList<Ogrenci>()


    while (true){

        println("Öğrenci adı giriniz:")
        val ad = girdi.next()
        println("Öğrenci sınıfı giriniz:")
        val sinif= girdi.next()

        val yeniOgrenci = Ogrenci(sayac,ad,sinif)
        sayac++

        ogrenciler.add(yeniOgrenci)

        println("Çıkmak için (1)-Devam etmek için diğer sayılar")
        val cikis=girdi.nextInt()

        if (cikis==1){
            for (ogrenci in ogrenciler){
                println("--------------")
                println("Öğrenci no : ${ogrenci.no}")
                println("Öğrenci adı : ${ogrenci.ad}")
                println("Öğrenci sınıf : ${ogrenci.sinif}")
            }
            println("Çıkış yapıldı.")
            break

        }
    }

}