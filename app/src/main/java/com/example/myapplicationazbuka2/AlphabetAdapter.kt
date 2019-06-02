package com.example.myapplicationazbuka2


import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.grid_item.view.*
import android.graphics.Bitmap
import android.graphics.BitmapFactory


class AlphabetAdapter(
    val context:Context,
    val titles:ArrayList<String>,
    val images: ArrayList<Int>
):BaseAdapter()
{
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view=LayoutInflater.from(context).inflate(R.layout.grid_item,parent,false)
        //view.android_gridview_image.setImageResource(images[position])

        val options = BitmapFactory.Options()
        options.inJustDecodeBounds = false
        options.inPreferredConfig = Bitmap.Config.ARGB_8888
        options.inSampleSize = 3
        val icon = BitmapFactory.decodeResource(
            context.resources,
            images[position], options
        )
        view.android_gridview_image.setImageBitmap(icon)
        view.android_gridview_text.text = titles[position]


        return view
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return titles.size
    }


}
