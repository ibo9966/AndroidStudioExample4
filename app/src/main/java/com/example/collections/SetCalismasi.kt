package com.example.collections

fun main() {

    val meyveler = setOf("Çilek","Muz","Elma","Kivi")   //Tanımlama yapmadan yani string koymadanda yazılır
    val meyveler1 = setOf<String>("Çilek","Muz","Elma","Kivi")

    val iller = mutableSetOf("Bursa","İstanbul","Ankara","İzmir")   //Tanımlama yapmadan yani string koymadanda yazılır
    val iller1 = mutableSetOf<String>("Bursa","İstanbul","Ankara","İzmir")

    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())
    println(sayilar)  // .toString ile de gösteribilir normal sayilar olarak da gösterilebilir.

    sayilar.add(21)
    println(sayilar.toString())

    println(sayilar.elementAt(1))
    println(sayilar.size)      //Boyut belirlemede .size veya . count kullabiliriz
    println(sayilar.count())   //Boyut belirlemede .size veya . count kullabiliriz

    println(sayilar.isEmpty())  // BOŞ MU? ->Boolean değer vericek

    println(sayilar.contains(20)) //20 sayisı var mı yok mu? ->Boolean değer vericek

    for (s in sayilar){
        println(s)
    }

    for ((i,s) in sayilar.withIndex()){
        println("${i + 1} -> $s")
    }

    sayilar.remove(10)  // belirtilen "10" elemanı çıkartıldı.
    println(sayilar.toString())

    sayilar.clear()     //Tüm liste sıfırlanıp boş küme kalıyor. Boş küme için isEmpty dediğimiz TRUE veriyor.
    println(sayilar.toString())
    println(sayilar.isEmpty())

}