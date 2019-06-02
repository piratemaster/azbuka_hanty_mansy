package com.example.myapplicationazbuka2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.letter_layout.*
import android.media.MediaPlayer
import android.widget.AdapterView


class LetterLayoutClass: AppCompatActivity() {

//    var imageArray = arrayOf<Int>(
//        R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6,
//        R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13, R.drawable.s14, R.drawable.s15,
//        R.drawable.s16, R.drawable.s17, R.drawable.s18, R.drawable.s19, R.drawable.s20, R.drawable.s21, R.drawable.s22, R.drawable.s23, R.drawable.s24,
//        R.drawable.s25,R.drawable.s26, R.drawable.s27, R.drawable.s28, R.drawable.s29, R.drawable.s30, -1, R.drawable.s32, R.drawable.s33, R.drawable.s34,
//        R.drawable.s35, R.drawable.s36, R.drawable.s37, R.drawable.s38, R.drawable.s39, R.drawable.s40, R.drawable.s41, R.drawable.s42, R.drawable.s43,
//        R.drawable.s44, R.drawable.s45, R.drawable.s46, R.drawable.s47, R.drawable.s48, R.drawable.s49, R.drawable.s50, R.drawable.s51, R.drawable.s52,
//        R.drawable.s53, R.drawable.s54, R.drawable.s55, R.drawable.s56, R.drawable.s57, R.drawable.s58, R.drawable.s59, R.drawable.s60, R.drawable.s61,
//        R.drawable.s62, R.drawable.s63, R.drawable.s64, R.drawable.s65, R.drawable.s66, R.drawable.s67, R.drawable.s68, R.drawable.s69, R.drawable.s70,
//        R.drawable.s71, R.drawable.s72, R.drawable.s73, R.drawable.s74, R.drawable.s75, R.drawable.s76, R.drawable.s77, R.drawable.s78, R.drawable.s79,
//        R.drawable.s80, R.drawable.s81, R.drawable.s82, R.drawable.s83, R.drawable.s84, R.drawable.s85, R.drawable.s86, R.drawable.s87, R.drawable.s88
//    )
//
//    var soundM = arrayOf<Int>(
//        R.raw.m1, R.raw.m2, R.raw.m3, R.raw.m4, R.raw.m5, R.raw.m6,
//        R.raw.m7, R.raw.m8, R.raw.m9, R.raw.m10, R.raw.m11, R.raw.m12, R.raw.m13, R.raw.m14, R.raw.m15,
//        R.raw.m16, R.raw.m17, R.raw.m18, R.raw.m19, R.raw.m20, R.raw.m21, R.raw.m22, R.raw.m23, R.raw.m24,
//        R.raw.m25,R.raw.m26, R.raw.m27, R.raw.m28, R.raw.m29, R.raw.m30, -1, R.raw.m32, R.raw.m33, R.raw.m34,
//        R.raw.m35, R.raw.m36, R.raw.m37, R.raw.m38, R.raw.m39, R.raw.m40, R.raw.m41, R.raw.m42, R.raw.m43,
//        R.raw.m44, R.raw.m45, R.raw.m46, R.raw.m47, R.raw.m48, R.raw.m49, R.raw.m50, R.raw.m51, R.raw.m52,
//        R.raw.m53, R.raw.m54, R.raw.m55, R.raw.m56, R.raw.m57, R.raw.m58, R.raw.m59, R.raw.m60, R.raw.m61,
//        R.raw.m62, R.raw.m63, R.raw.m64, R.raw.m65, R.raw.m66, R.raw.m67, R.raw.m68, R.raw.m69, R.raw.m70,
//        R.raw.m71, R.raw.m72, R.raw.m73, R.raw.m74, R.raw.m75, R.raw.m76, R.raw.m77, R.raw.m78, R.raw.m79,
//        R.raw.m80, R.raw.m81, R.raw.m82, R.raw.m83, R.raw.m84, R.raw.m85, R.raw.m86, R.raw.m87, R.raw.m88
//    )
//
//    var index = emptyArray<Int>()
//    val wordm_ = arrayOf<String>(
//        "анькас" ,"āмп" ,"вāс" ,"сāграп" ,"то̄рев" ,"нēвыр" ,"ёвтыг" ,"кāтанкаг" ,"исвеся" ,"ӣснас" ,"йӣв" ,"касаӣ" ,
//        "лāпанты" ,"мансын" ,"ня̄лы" ,"мāӈквала" ,"охсар" ,"пāля" ,"пасанкве" ,"во̄р кати" ,"кēрсяк" ,
//        "улас" ,"ӯсморах" ,"хотаӈ" ,"сāлы" ,"вы̄гыр пил" ,"писаль" ,"халэв" ,"лэ̄ӈын" ,"ю̄нтуп" ,"NULL" ,
//        "истакан" ,"мис" ,"порыгпанэ̄ква" ,"ӯмпи" ,"рап" ,"сāкваляк" ,"āрась" ,"пӯтыска" ,"пун" ,"со̄выр" ,"āгӣрись" ,"ня̄врам" ,
//        "āкань" ,"сāӈквылтап" ,"лēккар" ,"исхор" ,"йӣкв" ,"кēнт" ,"кēрняль" ,"лāхс" ,
//        "лув" ,"лāхс" ,"лё̄мвой" ,"катикве" ,"мӯӈн" ,"нāй" ,"нимсар" ,"ня̄нь" ,"нё̄р" ,"осьсялэ̄г" ,"по̄льуӣ" ,"по̄хлэп" ,
//        "пāкв" ,"паквсам" ,"сāвни" ,"сэ̄ри" ,"то̄тап" ,"тӯӣтсам" ,"хāӣтупа" ,
//        "хо̄вт" ,"хо̄своӣ" ,"хо̄тал" ,"сāлыуӣ" ,"сыматан" ,"э̄ква" ,"э̄нтап" ,"ю̄нтпыӈ ӯӣ" ,"ю̄своӣ" ,"я̄хул" ,
//        "я̄ӈклӯӣмас" ,"ялпыӈӯй" ,"янгуӣ" ,"ё̄рнкол" ,"ёнгынут" ,"пуӈк" ,"ӯльпа" ,"ӯринэ̄ква"
//    )

    private val word__ = ImageViewClass()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.letter_layout)
        val actionbar = supportActionBar
        //set actionbar title

        val bundle=intent.extras
        val letter = bundle.getString("__letter")
        val images = bundle.getIntegerArrayList("__img")
        val text = bundle.getStringArrayList("__text")
        val soundM = bundle.getIntegerArrayList("__sound")
        actionbar!!.title = "Буква " + letter
        actionbar.setDisplayHomeAsUpEnabled(true)
        //val sound : MediaPlayer = MediaPlayer.create(applicationContext, R.raw.h1)
        //sound.start()
        var sound : MediaPlayer = MediaPlayer.create(applicationContext, R.raw.m1)
        grid_view_image_text.adapter=AlphabetAdapter(applicationContext, text, images)
        //Toast.makeText(applicationContext, "GridView Item: "+index.size, Toast.LENGTH_LONG).show()
        grid_view_image_text.onItemClickListener = AdapterView.OnItemClickListener {
                parent, view, position, id ->
           // Toast.makeText(applicationContext, "GridView Item: $position ", Toast.LENGTH_LONG).show()
            sound.reset()
            sound = MediaPlayer.create(applicationContext, soundM[position])
            sound.start()

                //sound.
           // sound.stop()
        }

    }





//    fun getImages(): ArrayList<Int> {
//        val images=ArrayList<Int>()
//        for (i in index) {
//            images.add(imageArray[i])
//        }
//        return images
//    }
//
//    fun getTitles(): ArrayList<String> {
//        val titles=ArrayList<String>()
//        for (i in index) {
//            titles.add(wordm_[i])
//        }
//        return titles
//    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}

//var strUser: String = intent.getStringExtra("value") // 2
    //Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
