package com.github.drawablebitmapconverterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import com.github.drawablebitmapconverterlibrary.DrawableBitmapConverter

/**
 * Class to show list of drawable in list view and show selected image drawable to user.
 */
class MainActivity : AppCompatActivity() {

    val drawableIds = arrayOf(R.drawable.ic_amazon_prime_video, R.drawable.ic_ancestry, R.drawable.ic_filmmaker_pro,
            R.drawable.ic_genshin_impact, R.drawable.ic_youtube_studio)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawableNames = arrayOf(resources.getResourceName(R.drawable.ic_amazon_prime_video), resources.getResourceName(R.drawable.ic_ancestry), resources.getResourceName(R.drawable.ic_filmmaker_pro),
                resources.getResourceName(R.drawable.ic_genshin_impact), resources.getResourceName(R.drawable.ic_youtube_studio))

        val drawableListView = findViewById<ListView>(R.id.lstDrawable)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
                drawableNames)
        drawableListView.adapter = adapter

        val selectedImageView = findViewById<ImageView>(R.id.imgView)
        drawableListView.setOnItemClickListener { _, _, position, id ->
            selectedImageView.setImageBitmap(DrawableBitmapConverter.convert(this, drawableIds.get(position)))
        }
    }
}