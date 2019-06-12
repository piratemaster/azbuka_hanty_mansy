package com.example.myapplicationazbuka2

import android.content.Context
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.support.v4.widget.DrawerLayout
import android.support.design.widget.NavigationView
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.widget.Toast
import android.content.Intent
import android.media.MediaPlayer
import android.view.View
import kotlinx.android.synthetic.main.content_main.*
import android.widget.GridView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper








class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    val letm: Array<String> = arrayOf(
        "А","Ā","Б","В","Г","Д","Е","Ē","Ё","\uF512","Ж","З","И","Ӣ","Й","К","Л","М",
        "Н","ӈ","О","Ō","П","Р","С","Т","У","Ӯ","Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ы","\uF520",
        "Ь","Э","\uF522","Ю","\uF52C","Я","\uF528"
    )
    val leth: Array<String> = arrayOf(
        "А","Ӑ","В","И","Й","К","Л","Ԓ","М","Н",
        "ӈ","О","Ө","П","Р","С","Т","У","Ў","Х",
        "Ш","Щ","Ы", "Ь","Э","Є", "\uF526", "Ю", "Я", "Ə"
    )

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_settings -> true
//            else -> super.onOptionsItemSelected(item)
//        }
//    }

    private val letterClass = AdapterClass()
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val letter_grid = findViewById<View>(R.id.gridWiew) as GridView
        when (item.itemId) {
//
            R.id.nav_alphabet_m -> {

                letterClass.abc(letm, applicationContext, letter_grid, "m")

            }
            R.id.nav_alphabet_h -> {
                letterClass.abc(leth, applicationContext, letter_grid, "h")
            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
//    fun runAnother(a:String){
//        run {
//            val intent = Intent(this, LetterLayoutClass::class.java)
//            // start your next activity
//            startActivity(intent)
//        }
//    }
}
