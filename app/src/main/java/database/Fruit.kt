package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.*

/**
 * Data table of fruit and their seasons. To be prepopulated when the user first opens the app.
 *
 * @constructor fruitName name of the fruit
 * @constructor fruit season represented by A-L as corresponds to Jan-Dec
 */
@Entity(tableName = "fruit_info_table")
data class Fruit (
    @PrimaryKey(autoGenerate = true)
    var fruitId: Int = 0,

    @ColumnInfo(name = "fruit_name")
    var fruitName: String,

    //A-L = Jan-Dec
    @ColumnInfo(name = "fruit_season")
    var fruitSeason: String
        ){
    private val date = Calendar.getInstance().time
    private val month = SimpleDateFormat("MM").format(date)
    val monthChar = when(month){
        "01" -> "A"
        "02" -> "B"
        "03" -> "C"
        "04" -> "D"
        "05" -> "E"
        "06" -> "F"
        "07" -> "G"
        "08" -> "H"
        "09" -> "I"
        "10" -> "J"
        "11" -> "K"
        else -> "L"
    }
    fun isInSeason() = (monthChar in fruitSeason)
}