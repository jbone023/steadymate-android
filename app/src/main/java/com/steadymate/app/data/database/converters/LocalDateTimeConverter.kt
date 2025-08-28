package com.steadymate.app.data.database.converters

import androidx.room.TypeConverter
import kotlinx.datetime.LocalDateTime

/**
 * Room type converter for kotlinx.datetime.LocalDateTime
 */
class LocalDateTimeConverter {
    
    @TypeConverter
    fun fromLocalDateTime(value: LocalDateTime?): String? {
        return value?.toString()
    }
    
    @TypeConverter
    fun toLocalDateTime(value: String?): LocalDateTime? {
        return value?.let { LocalDateTime.parse(it) }
    }
}
