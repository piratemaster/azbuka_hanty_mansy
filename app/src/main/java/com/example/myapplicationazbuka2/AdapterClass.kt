package com.example.myapplicationazbuka2

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*


class AdapterClass {

    var no: Int = -1

    var imageArray = arrayOf<Int>(
        R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6,
        no, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13, R.drawable.s14, R.drawable.s15,
        R.drawable.s16, R.drawable.s17, R.drawable.s18, R.drawable.s19, R.drawable.s20, R.drawable.s21, R.drawable.s22, R.drawable.s23, R.drawable.s24,
        R.drawable.s25, no, R.drawable.s27, R.drawable.s28, R.drawable.s29, R.drawable.s30, -1, R.drawable.s32, R.drawable.s33, R.drawable.s34,
        R.drawable.s35, R.drawable.s36, R.drawable.s37, R.drawable.s38, R.drawable.s39, R.drawable.s40, R.drawable.s41, R.drawable.s42, R.drawable.s43,
        R.drawable.s44, R.drawable.s45, R.drawable.s46, no, R.drawable.s48, R.drawable.s49, R.drawable.s50, R.drawable.s51, R.drawable.s52,
        no, R.drawable.s54, no, R.drawable.s56, R.drawable.s57, no, R.drawable.s59, no, R.drawable.s61,
        R.drawable.s62, R.drawable.s63, R.drawable.s64, R.drawable.s65, R.drawable.s66, R.drawable.s67, R.drawable.s68, R.drawable.s69, R.drawable.s70,
        R.drawable.s71, R.drawable.s72, R.drawable.s73, no, no, R.drawable.s76, R.drawable.s77, R.drawable.s78, R.drawable.s79,
        R.drawable.s80, R.drawable.s81, R.drawable.s82, R.drawable.s83, R.drawable.s84, R.drawable.s85, R.drawable.s86, R.drawable.s87, R.drawable.s88
    )

    var soundM = arrayOf<Int>(
        R.raw.m1, R.raw.m2, R.raw.m3, R.raw.m4, R.raw.m5, R.raw.m6,
        no, R.raw.m8, R.raw.m9, R.raw.m10, R.raw.m11, R.raw.m12, R.raw.m13, R.raw.m14, R.raw.m15,
        R.raw.m16, R.raw.m17, R.raw.m18, R.raw.m19, R.raw.m20, R.raw.m21, R.raw.m22, R.raw.m23, R.raw.m24,
        R.raw.m25, no, R.raw.m27, R.raw.m28, R.raw.m29, R.raw.m30, no, R.raw.m32, R.raw.m33, R.raw.m34,
        R.raw.m35, R.raw.m36, R.raw.m37, R.raw.m38, R.raw.m39, R.raw.m40, R.raw.m41, R.raw.m42, R.raw.m43,
        R.raw.m44, R.raw.m45, R.raw.m46, no, R.raw.m48, R.raw.m49, R.raw.m50, R.raw.m51, R.raw.m52,
        no, R.raw.m54, no, R.raw.m56, R.raw.m57, no, R.raw.m59, no, R.raw.m61,
        R.raw.m62, R.raw.m63, R.raw.m64, R.raw.m65, R.raw.m66, R.raw.m67, R.raw.m68, R.raw.m69, R.raw.m70,
        R.raw.m71, R.raw.m72, R.raw.m73, no, no, R.raw.m76, R.raw.m77, R.raw.m78, R.raw.m79,
        R.raw.m80, R.raw.m81, R.raw.m82, R.raw.m83, R.raw.m84, R.raw.m85, R.raw.m86, R.raw.m87, no
    )

    var soundH = arrayOf<Int>(
        R.raw.h1, R.raw.h2, R.raw.h3, R.raw.h4, R.raw.h5, R.raw.h6,
        no, R.raw.h8, R.raw.h9, R.raw.h10, R.raw.h11, R.raw.h12, R.raw.h13, R.raw.h14, R.raw.h15,
        R.raw.h16, R.raw.h17, R.raw.h18, R.raw.h19, R.raw.h20, R.raw.h21, R.raw.h22, R.raw.h23, R.raw.h24,
        R.raw.h25, no, R.raw.h27, R.raw.h28, R.raw.h29, R.raw.h30, no, R.raw.h32, R.raw.h33, R.raw.h34,
        R.raw.h35, R.raw.h36, R.raw.h37, R.raw.h38, R.raw.h39, R.raw.h40, R.raw.h41, R.raw.h42, R.raw.h43,
        R.raw.h44, R.raw.h45, R.raw.h46, R.raw.h47, R.raw.h48, R.raw.h49, R.raw.h50, R.raw.h51, R.raw.h52,
        no, R.raw.h54, no, R.raw.h56, R.raw.h57, no, R.raw.h59, no, R.raw.h61,
        R.raw.h62, R.raw.h63, R.raw.h64, R.raw.h65, R.raw.h66, R.raw.h67, R.raw.h68, R.raw.h69, R.raw.h70,
        R.raw.h71, R.raw.h72, R.raw.h73, no, no, R.raw.h76, R.raw.h77, R.raw.h78, R.raw.h79,
        R.raw.h80, R.raw.h81, R.raw.h82, R.raw.h83, R.raw.h84, R.raw.h85, R.raw.h86, R.raw.h87, no
    )

    val wordm_ = arrayOf<String>(
        "АНЬКАС" ,"ĀМП" ,"ВĀС" ,"СĀГРАП" ,"ТŌРЕВ" ,"НĒВЫР" ,"NULL" ,"КĀТАНКАГ" ,"ИСВЕСЯ" ,"ӢСНАС" ,"ЙӢВ" ,"КАСАӢ" ,
        "ЛĀПАНТЫ" ,"МАНСЫН" ,"Н\uF528ЛЫ" ,"МĀӇКВАЛА" ,"ОХСАР" ,"ПĀЛЯ" ,"ПАСАНКВЕ" ,"ВОР КАТИ" ,"КĒРСЯК" ,
        "УЛАС" ,"ӮСМОРАХ" ,"ХОТАӇ" ,"СĀЛЫ" ,"NULL" ,"ПИСАЛЬ" ,"ХАЛЭВ","Л\uF522ӇЫН" ,"\uF52CНТУП" ,"NULL" ,
        "ИСТАКАН" ,"МИС" ,"ПОРЫГПАН\uF522КВА" ,"ӮМПИ" ,"РАП" ,"СĀКВАЛЯК" ,"ĀРАСЬ" ,"ПӮТЫСКА" ,"ПУН" ,"СŌВЫР" ,"ĀГӢРИСЬ" ,"Н\uF528ВРАМ" ,
        "ĀКАНЬ" ,"СĀӇКВЫЛТАП" ,"ЛĒККАР" ,"ИСХОР" ,"ЙӢКВ" ,"КĒНТ" ,"КĒРНЯЛЬ" ,"ЛĀХС" ,
        "ЛУВ" ,"NULL" ,"Л\uF512МВОЙ" ,"NULL" ,"МӮӇН" ,"НĀЙ" ,"NULL" ,"Н\uF528НЬ" ,"NULL" ,"ОСЬСЯЛ\uF522Г" ,"ПŌЛЬУӢ" ,"ПŌХЛЭП" ,
        "ПĀКВ" ,"ПАКВСАМ" ,"СĀВНИ" ,"С\uF522РИ" ,"ТŌТАП" ,"ТӮӢТСАМ" ,"ХĀӢТУПА" ,
        "ХŌВТ" ,"ХŌСВОӢ" ,"ХŌТАЛ" ,"NULL" ,"NULL" ,"\uF522КВА" ,"\uF522НТАП" ,"\uF52CНТПЫӇ ӮӢ" ,"\uF52CСВОӢ" ,"\uF528ХУЛ" ,
        "\uF528ӇКЛӮӢМАС" ,"ЯЛПЫӇӮЙ" ,"ЯНГУӢ" ,"\uF512РНКОЛ" ,"ЁНГЫНУТ" ,"ПУӇК" ,"ӮЛЬПА" ,"NULL"
    )


    val wordh_ = arrayOf<String>(
        "ǍНЬКǍШ","АМП", "ВАСЫ", "ԒАЮМ", "НУВИ МОЙПǍР", "АЙ ԒОВ", "NULL", "КАТАНКА", "ТӮТ", "ИШНИ", "ЮХ", "ВЕԒПǍС КЕШИ", "ЛЫПǍНТА",
        "ЛЎК", "НЯЛЫ", "АӇКǍԒ ВОЙ", "ВУХСАР", "НЄ ОШ", "ПǍСАН", "РǍЩ", "СǍӇКУП", "АЙ ПǍСАН", "ВƏЩВƏԒ", "ХУТǍӇ", "ВЎԒЫ", "NULL",
        "ПУШКАН", "ХǍЛЭВ", "ԒАӇКИ", "ЙИНТУП", "NULL", "ǍСТǍКАН", "МИС", "НАВǍРНЄ", "ЭМПИ", "РǍП", "САВНЄ", "РАТХǍР", "УСУМ", "ПЎН", "ШОВǍР",
        "ЭВИ", "НЯВРЄМ", "АКАНЬ", "НАРСЬЮХ", "ТОХТАР", "ИСХУР", "ЯК", "МИЛ", "КАРТСЄСЫ", "ТУЛǍХ", "НЄ ԒОВ", "NULL", "ПЄԒӇА",
        "NULL", "КАРǍӇ ПУШǍХ", "ТЎТ", "NULL", "НЯНЬ", "NULL", "СУСԒ", "КЄРВОЙ", "ЩЎЛ", "НОХǍР", "НОХǍР СЄМ", "СЭВУПСЫ",
        "СЫРǍНТА", "ԒАРАШ", "ԒОНЦ СЄМ", "НУРУМ", "ХƏԒ ЮХ", "ХǍШӇА", "ХǍТԒ", "NULL", "NULL", "ИМИ", "ǍНТУП",
        "ЙИНТПǍӇ ВОЙ", "КЎРǍК", "ЦǍПАР ХЎԒ", "ЕӇК ЩЎРАХИ", "ЁМǍӇ ВОЙ", "КЎРǍӇ ВОЙ", "ЮРН ХОТ", "ЮНТУТ", "ПЄӇК", "НОХǍР ЮХ", "NULL"
    )

    val wordRu = arrayOf<String>(
        "горох", "собака", "утка с зеленой головой", "топор", "белый медведь", "жеребенок",
        "NULL", "валенки", "свеча", "окно", "дерево", "нож охотничий", "бабочка",
        "глухарь", "столовая ложка", "сова", "лиса", "овца", "столик", "рысь", "молоток",
        "стул", "малина", "лебедь", "северный олень", "NULL", "ружье", "чайка", "белка",
        "игла", "NULL", "стакан", "корова", "лягушка", "ковш", "ласточка", "сорока",
        "костер", "подушка", "перо", "заяц", "девочка", "Ребенок", "кукла", "балалайка",
        "доктор", "тень", "танец", "шапка", "капкан", "гриб", "лошадь", "NULL", "комар",
        "NULL", "яйцо", "огонь", "паук", "хлеб", "NULL", "ящерица", "снегирь", "пуговица",
        "шишка", "кедровый орех", "черника", "муха", "ящик", "снежинка", "мост", "ель",
        "муравей", "солнце", "NULL", "NULL", "женщина", "пояс", "ёж", "орел", "чебак",
        "сосулька", "змея", "лось", "чум", "игрушка", "зуб", "кедр"
    )

    val wordEn = arrayOf<String>(
        "peas", "dog", "duck", "axe", "polar bear", "colt", "NULL", "Valenki", "candle",
        "window", "tree", "hunting knife", "butterfly", "capercaillie", "spoon", "owl",
        "fox", "sheep", "table", "lynx", "hammer", "chair", "raspberry", "swan",
        "reindeer", "NULL", "shotgun", "gull", "squirrel", "needle", "NULL", "glass",
        "cow", "frog", "bucket", "swallow", "magpie", "campfire", "pillow", "feather",
        "hare", "girl", "child", "doll", "balalaika", "doctor", "shadow", "dance",
        "hat", "trap", "mushroom", "horse", "NULL", "mosquito", "NULL", "egg", "fire",
        "spider", "bread", "NULL", "lizard", "bullfinch", "button", "pinecone", "cedar nut",
        "blueberry", "fly", "box",  "snowflake", "bridge", "spruce", "ant", "sun", "NULL",
        "NULL", "woman", "belt", "hedgehog", "eagle", "chebak (roach)", "icicle", "snake",
        "moose", "(chum) wickiup", "toy", "tooth", "cedar"
    )




    fun abc (letm:Array<String>, appContext: Context, letter:GridView, alphabet:String) {
        //val letter = (R.id.gridWiew) as GridView

        val typeface = Typeface.createFromAsset(appContext.assets, "fonts/pt_serif.ttf")

        var __word__ : Array<String> = emptyArray()
        var __sound__ : Array<Int> = emptyArray()
        if (alphabet.equals("m")) {__word__ = wordm_; __sound__ = soundM}
        if (alphabet.equals("h")) {__word__ = wordh_; __sound__ = soundH}
        val adapter = object : ArrayAdapter<String>(appContext, android.R.layout.simple_list_item_1, letm) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                // Get the Item from ListView
                val view = super.getView(position, convertView, parent)

                // Initialize a TextView for ListView each Item
                val tv = view.findViewById<View>(android.R.id.text1) as TextView

                tv.setTypeface(typeface)

                // Set the text color of TextView (ListView Item)
                //tv.setTextColor(Color.RED)

                // Generate ListView Item using TextView
                return view
            }
        }


        letter.adapter = adapter




        val itemListener = AdapterView.OnItemClickListener { parent, v, position, id ->
            runAnother(appContext, parent.getItemAtPosition(position).toString(), alphabet, __word__, __sound__, wordRu, wordEn)
        }
        letter.onItemClickListener = itemListener

    }
    fun runAnother(
        appContext: Context,
        let: String,
        alphabet: String,
        __word__: Array<String>,
        __sound__: Array<Int>,
        wordRu: Array<String>,
        wordEn: Array<String>
    ){
        var index = search_(let, __word__)
        val images=ArrayList<Int>()
        for (i in index) {
            images.add(imageArray[i])
        }
        val text=ArrayList<String>()
        for (i in index) {
            text.add(__word__[i])
        }
        val textEn=ArrayList<String>()
        for (i in index) {
            textEn.add(wordEn[i])
        }
        val textRu=ArrayList<String>()
        for (i in index) {
            textRu.add(wordRu[i])
        }
        val sound=ArrayList<Int>()
        for (i in index) {
            sound.add(__sound__[i])
        }
        val intent = Intent( )
        intent.setClass(appContext, LetterLayoutClass::class.java)
        //intent.putExtra(letter, )
        intent.putExtra("__letter", let)
        intent.putExtra("__img", images)
        intent.putExtra("__text", text)
        intent.putExtra("__sound", sound)
        intent.putExtra("__textEn", textEn)
        intent.putExtra("__textRu", textRu)
        //intent.putExtra("appContext", appContext)
        appContext.startActivity(intent)
    }

    fun search_(let: String, __word__: Array<String>): Array<Int> {
        var index : Array<Int> = emptyArray()
        for((i, word) in __word__.withIndex()) {
            if (word.contains(let, ignoreCase = true))
                index += i
        }
        return index
    }
}