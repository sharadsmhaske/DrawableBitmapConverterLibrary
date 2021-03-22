package com.github.drawablebitmapconverterlibrary

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory

/**
 * DrawableBitmapConverter singleton responsible for converting drawable resource to equivalent bitmap.
 * Usage : DrawableBitmapConverter.convert(context, R.drawable.image)
 */
object DrawableBitmapConverter {

    /**
     * Return the bitmap for drawable resource using bitmap factory
     * @param appContext - application context
     * @param resId - resource id of drawable
     * @return bitmap for drawable resource otherwise optional when context is nil or resource not found.
     * @See BitmapFactory.decodeResource for more details
     */
    fun convert(appContext: Context, resId: Int) : Bitmap? {
        appContext.let {
            return BitmapFactory.decodeResource(it.getResources(), resId)
        }
    }
}