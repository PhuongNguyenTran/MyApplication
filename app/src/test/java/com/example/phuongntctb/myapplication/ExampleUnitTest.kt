package com.example.phuongntctb.myapplication

import android.widget.TextView
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.Shadows

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun check_init_screen(){
        val mMainActivity = Robolectric.buildActivity(
                MainActivity::class.java).create().start().resume().get()

        val actualValue = mMainActivity.findViewById<TextView>(R.id.message).text
        val expectedValue = "we go onCreate"
        Assert.assertTrue(actualValue.contains(expectedValue))
    }
}
