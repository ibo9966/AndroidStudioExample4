package com.example.collections

fun main() {

    val o1=Ogrenci(1,"Ahmet","11F")
    val o2=Ogrenci(2,"Zeynep","10R")
    val o3=Ogrenci(3,"Ceyda","12A")
    val o4=Ogrenci(4,"Mehmet","9Z")
    val o5=Ogrenci(5,"Yasin","11F")

    val ogrenciler=ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    val sonucList = ogrenciler.filter { it.no>=2 }
    val sonucList2 = ogrenciler.filter { (it.ad).contains("a") }
    val sonucList3 = ogrenciler.filter {it.sinif=="11F" }

    for (o in sonucList3){
        println("--------------")
        println("Öğrenci No: ${o.no}")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }



}