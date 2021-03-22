package com.github.drawablebitmapconverterlibrary

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DrawableBitmapConverterTest {

    @Test
    fun convertDrawableToBitmapWithContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val bitmap = DrawableBitmapConverter.convert(appContext, android.R.drawable.ic_secure)
        Assert.assertNotNull(bitmap)
    }
}