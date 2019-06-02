package com.example.myapplicationazbuka2

import android.content.Context

class ImageViewClass {


    fun res_search(letter:String, appContext: Context): Array<Int> {

        val wordm_ = arrayOf<String>(
            "анькас" ,"āмп" ,"вāс" ,"сāграп" ,"то̄рев" ,"нēвыр" ,"ёвтыг" ,"кāтанкаг" ,"исвеся" ,"ӣснас" ,"йӣв" ,"касаӣ" ,
            "лāпанты" ,"мансын" ,"ня̄лы" ,"мāӈквала" ,"охсар" ,"пāля" ,"пасанкве" ,"во̄р кати" ,"кēрсяк" ,
            "улас" ,"ӯсморах" ,"хотаӈ" ,"сāлы" ,"вы̄гыр пил" ,"писаль" ,"халэв" ,"лэ̄ӈын" ,"ю̄нтуп" ,"NULL" ,
            "истакан" ,"мис" ,"порыгпанэ̄ква" ,"ӯмпи" ,"рап" ,"сāкваляк" ,"āрась" ,"пӯтыска" ,"пун" ,"со̄выр" ,"āгӣрись" ,"ня̄врам" ,
            "āкань" ,"сāӈквылтап" ,"лēккар" ,"исхор" ,"йӣкв" ,"кēнт" ,"кēрняль" ,"лāхс" ,
            "лув" ,"лāхс" ,"лё̄мвой" ,"катикве" ,"мӯӈн" ,"нāй" ,"нимсар" ,"ня̄нь" ,"нё̄р" ,"осьсялэ̄г" ,"по̄льуӣ" ,"по̄хлэп" ,
            "пāкв" ,"паквсам" ,"сāвни" ,"сэ̄ри" ,"то̄тап" ,"тӯӣтсам" ,"хāӣтупа" ,
            "хо̄вт" ,"хо̄своӣ" ,"хо̄тал" ,"сāлыуӣ" ,"сыматан" ,"э̄ква" ,"э̄нтап" ,"ю̄нтпыӈ ӯӣ" ,"ю̄своӣ" ,"я̄хул" ,
            "я̄ӈклӯӣмас" ,"ялпыӈӯй" ,"янгуӣ" ,"ё̄рнкол" ,"ёнгынут" ,"пуӈк" ,"ӯльпа" ,"ӯринэ̄ква"
        )
        var index = emptyArray<Int>()
        var i : Int = 1
        for(word in wordm_){
            var word__ : String = word[0].toString() + word[1]
            if (word[0].equals(letter) || word__.equals(letter))
                index+=i
            i++
        }
        return index
//        if(index.isNotEmpty())
//            //image_print(letter, appContext, wordm_)
//        else
//            Toast.makeText(appContext,"На данную букву нет слов", Toast.LENGTH_SHORT).show()
    }
}