package com.example.myapplicationazbuka2

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.TextView
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper


class LetterLayoutClass: AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    private val word__ = ImageViewClass()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.words_layout)
        val actionbar = supportActionBar
        //set actionbar title
        //val wordAdapter = WordAdapter()

        val typeface = Typeface.createFromAsset(this.assets, "fonts/pt_serif.ttf")
        val bundle=intent.extras
        val letter = bundle.getString("__letter")
        val images = bundle.getIntegerArrayList("__img")
        val text = bundle.getStringArrayList("__text")
        val textEn = bundle.getStringArrayList("__textEn")
        val textRu = bundle.getStringArrayList("__textRu")
        val soundM = bundle.getIntegerArrayList("__sound")
        actionbar!!.title = "Азбука"
        actionbar.setDisplayHomeAsUpEnabled(true)
        //val sound : MediaPlayer = MediaPlayer.create(applicationContext, R.raw.h1)
        //sound.start()
        //var sound : MediaPlayer = MediaPlayer.create(applicationContext, R.raw.m1)
        val word_grid = findViewById<View>(R.id.wordsGrid) as GridView
        val adapter =object :  ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, text){
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
        word_grid.adapter = adapter
//        wordsGrid.adapter=wordAdapter.WordLayout(text, applicationContext, )
//        grid_view_image_text.adapter=AlphabetAdapter(applicationContext, text, images)
        //Toast.makeText(applicationContext, "GridView Item: "+index.size, Toast.LENGTH_LONG).show()
        word_grid.onItemClickListener = AdapterView.OnItemClickListener {
                parent, view, position, id ->
           // Toast.makeText(applicationContext, "GridView Item: $position ", Toast.LENGTH_LONG).show()
            //sound.reset()
           // sound = MediaPlayer.create(applicationContext, soundM[position])
           // sound.start()

                //sound.
           // sound.stop()
            imageView(images[position],text[position], soundM[position], textEn[position], textRu[position])
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    fun imageView(image: Int, text: String, sound: Int, eng: String, rus: String) {

        val intent = Intent( )
        intent.setClass(applicationContext, ImageOutput::class.java)
        //intent.putExtra(letter, )
        intent.putExtra("__soundOutput", sound)
        intent.putExtra("__imgOutput", image)
        intent.putExtra("__textOutput", text)
        intent.putExtra("__textOutputEn", eng)
        intent.putExtra("__textOutputRu", rus)
        //intent.putExtra("appContext", appContext)
        applicationContext.startActivity(intent)
    }

}

//var strUser: String = intent.getStringExtra("value") // 2
    //Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
