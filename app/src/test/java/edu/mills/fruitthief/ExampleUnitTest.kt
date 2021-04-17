package edu.mills.fruitthief

import database.Fruit
import org.junit.Test

import org.junit.Assert.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        val fruit: Fruit = Fruit(0, "apple", "BC")
        assertEquals(false, fruit.isInSeason())

    }
}