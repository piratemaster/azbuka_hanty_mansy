package com.example.myapplicationazbuka2

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.widget.*
import android.support.v4.content.ContextCompat.startActivity


class AdapterClass {

    var imageArray = arrayOf<Int>(
        R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6,
        R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13, R.drawable.s14, R.drawable.s15,
        R.drawable.s16, R.drawable.s17, R.drawable.s18, R.drawable.s19, R.drawable.s20, R.drawable.s21, R.drawable.s22, R.drawable.s23, R.drawable.s24,
        R.drawable.s25,R.drawable.s26, R.drawable.s27, R.drawable.s28, R.drawable.s29, R.drawable.s30, -1, R.drawable.s32, R.drawable.s33, R.drawable.s34,
        R.drawable.s35, R.drawable.s36, R.drawable.s37, R.drawable.s38, R.drawable.s39, R.drawable.s40, R.drawable.s41, R.drawable.s42, R.drawable.s43,
        R.drawable.s44, R.drawable.s45, R.drawable.s46, R.drawable.s47, R.drawable.s48, R.drawable.s49, R.drawable.s50, R.drawable.s51, R.drawable.s52,
        R.drawable.s53, R.drawable.s54, R.drawable.s55, R.drawable.s56, R.drawable.s57, R.drawable.s58, R.drawable.s59, R.drawable.s60, R.drawable.s61,
        R.drawable.s62, R.drawable.s63, R.drawable.s64, R.drawable.s65, R.drawable.s66, R.drawable.s67, R.drawable.s68, R.drawable.s69, R.drawable.s70,
        R.drawable.s71, R.drawable.s72, R.drawable.s73, R.drawable.s74, R.drawable.s75, R.drawable.s76, R.drawable.s77, R.drawable.s78, R.drawable.s79,
        R.drawable.s80, R.drawable.s81, R.drawable.s82, R.drawable.s83, R.drawable.s84, R.drawable.s85, R.drawable.s86, R.drawable.s87, R.drawable.s88
    )

    var soundM = arrayOf<Int>(
        R.raw.m1, R.raw.m2, R.raw.m3, R.raw.m4, R.raw.m5, R.raw.m6,
        R.raw.m7, R.raw.m8, R.raw.m9, R.raw.m10, R.raw.m11, R.raw.m12, R.raw.m13, R.raw.m14, R.raw.m15,
        R.raw.m16, R.raw.m17, R.raw.m18, R.raw.m19, R.raw.m20, R.raw.m21, R.raw.m22, R.raw.m23, R.raw.m24,
        R.raw.m25,R.raw.m26, R.raw.m27, R.raw.m28, R.raw.m29, R.raw.m30, -1, R.raw.m32, R.raw.m33, R.raw.m34,
        R.raw.m35, R.raw.m36, R.raw.m37, R.raw.m38, R.raw.m39, R.raw.m40, R.raw.m41, R.raw.m42, R.raw.m43,
        R.raw.m44, R.raw.m45, R.raw.m46, R.raw.m47, R.raw.m48, R.raw.m49, R.raw.m50, R.raw.m51, R.raw.m52,
        R.raw.m53, R.raw.m54, R.raw.m55, R.raw.m56, R.raw.m57, R.raw.m58, R.raw.m59, R.raw.m60, R.raw.m61,
        R.raw.m62, R.raw.m63, R.raw.m64, R.raw.m65, R.raw.m66, R.raw.m67, R.raw.m68, R.raw.m69, R.raw.m70,
        R.raw.m71, R.raw.m72, R.raw.m73, R.raw.m74, R.raw.m75, R.raw.m76, R.raw.m77, R.raw.m78, R.raw.m79,
        R.raw.m80, R.raw.m81, R.raw.m82, R.raw.m83, R.raw.m84, R.raw.m85, R.raw.m86, R.raw.m87, R.raw.m88
    )

    var soundH = arrayOf<Int>(
        R.raw.h1, R.raw.h2, R.raw.h3, R.raw.h4, R.raw.h5, R.raw.h6,
        R.raw.h7, R.raw.h8, R.raw.h9, R.raw.h10, R.raw.h11, R.raw.h12, R.raw.h13, R.raw.h14, R.raw.h15,
        R.raw.h16, R.raw.h17, R.raw.h18, R.raw.h19, R.raw.h20, R.raw.h21, R.raw.h22, R.raw.h23, R.raw.h24,
        R.raw.h25,R.raw.h26, R.raw.h27, R.raw.h28, R.raw.h29, R.raw.h30, -1, R.raw.h32, R.raw.h33, R.raw.h34,
        R.raw.h35, R.raw.h36, R.raw.h37, R.raw.h38, R.raw.h39, R.raw.h40, R.raw.h41, R.raw.h42, R.raw.h43,
        R.raw.h44, R.raw.h45, R.raw.h46, R.raw.h47, R.raw.h48, R.raw.h49, R.raw.h50, R.raw.h51, R.raw.h52,
        R.raw.h53, R.raw.h54, R.raw.h55, R.raw.h56, R.raw.h57, R.raw.h58, R.raw.h59, R.raw.h60, R.raw.h61,
        R.raw.h62, R.raw.h63, R.raw.h64, R.raw.h65, R.raw.h66, R.raw.h67, R.raw.h68, R.raw.h69, R.raw.h70,
        R.raw.h71, R.raw.h72, R.raw.h73, R.raw.h74, R.raw.h75, R.raw.h76, R.raw.h77, R.raw.h78, R.raw.h79,
        R.raw.h80, R.raw.h81, R.raw.h82, R.raw.h83, R.raw.h84, R.raw.h85, R.raw.h86, R.raw.h87, R.raw.h88
    )

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


    val wordh_ = arrayOf<String>(
        "ǎнькǎш","амп", "васы", "ԓаюм", "нуви мойпǎр", "ай ԓов", "немыт лумп", "катанка", "тӯт", "ишни", "юх", "веԓпǎс кеши", "лыпǎнта",
        "лўк", "нялы", "аӈкǎԓ вой", "вухсар", "нє ош", "пǎсан", "рǎщ", "сǎӈкуп", "ай пǎсан", "вəщвəԓ", "хутǎӈ", "вўԓы", "вўрмаль кусты",
        "пушкан", "хǎлэв", "ԓаӈки", "йинтуп", "лўк", "ǎстǎкан", "мис", "навǎрнє", "эмпи", "рǎп", "савнє", "ратхǎр", "усум", "пўн", "шовǎр",
        "эви", "няврєм", "акань", "нарсьюх", "тохтар", "исхур", "як", "мил", "картсєсы", "тулǎх", "нє ԓов", "юхан", "пєԓӈа",
        "ай кǎти", "карǎӈ пушǎх", "тўт", "нимсар ими", "нянь", "сǎӈхум", "сусԓ", "кєрвой", "щўл", "нохǎр", "нохǎр сєм", "сэвупсы",
        "сырǎнта", "ԓараш", "ԓонц сєм", "нурум", "хəԓ юх", "хǎшӈа", "хǎтԓ", "вўԓы пурты вой", "сух пунтыԓарщ", "ими", "ǎнтуп",
        "йинтпǎӈ вой", "кўрǎк", "цǎпар хўԓ", "еӈк щўрахи", "ёмǎӈ вой", "кўрǎӈ вой", "юрн хот", "юнтут", "пєӈк", "нохǎр юх", "вурӈа"
    )


    fun abc (letm:Array<String>, appContext: Context, letter:GridView, alphabet:String) {
        //val letter = (R.id.gridWiew) as GridView
        var __word__ : Array<String> = emptyArray()
        var __sound__ : Array<Int> = emptyArray()
        if (alphabet.equals("m")) {__word__ = wordm_; __sound__ = soundM}
        if (alphabet.equals("h")) {__word__ = wordh_; __sound__ = soundH}
        val adapter = ArrayAdapter(appContext, android.R.layout.simple_list_item_1, letm)
        letter.adapter = adapter

        val itemListener = AdapterView.OnItemClickListener { parent, v, position, id ->
            runAnother(appContext, parent.getItemAtPosition(position).toString(), alphabet, __word__, __sound__)
        }
        letter.onItemClickListener = itemListener

    }
    fun runAnother(appContext: Context, let:String, alphabet: String, __word__ : Array<String>, __sound__ : Array<Int>){
        var index = search_(let)
        val images=ArrayList<Int>()
        for (i in index) {
            images.add(imageArray[i])
        }
        val text=ArrayList<String>()
        for (i in index) {
            text.add(__word__[i])
        }
        val sound=ArrayList<Int>()
        for (i in index) {
            sound.add(__sound__[i])
        }
        val intent = Intent( )
        intent.setClass(appContext, LetterLayoutClass::class.java)
        //intent.putExtra(letter, )
        // и передадим в нее параметры
        intent.putExtra("__letter", let)
        intent.putExtra("__img", images)
        intent.putExtra("__text", text)
        intent.putExtra("__sound", sound)
        //intent.putExtra("appContext", appContext)
        appContext.startActivity(intent)
    }

    fun search_(let: String): Array<Int> {
        var index : Array<Int> = emptyArray()
        for((i, word) in wordm_.withIndex()) {
            if (word.contains(let, ignoreCase = true))
                index += i
        }
        return index
    }
}