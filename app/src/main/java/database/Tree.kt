package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data table of trees.
 *
 * @param fruit Int corresponding to the key of the fruit type in fruit_info_table
 * @param location Currently represented as a String, need to figure out how to best represent it
 */
@Entity(tableName = "tree_info_table")
data class Tree(
    @PrimaryKey(autoGenerate = true)
    var treeId: Int = 0,

    //points to fruit type in fruit_info_table
    @ColumnInfo(name = "fruit_type")
    var fruit: Int,

    @ColumnInfo(name = "tree_latitude")
    var lat: Double,

    @ColumnInfo(name = "tree_longitude")
    var long: Double
)