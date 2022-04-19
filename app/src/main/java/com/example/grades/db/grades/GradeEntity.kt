package com.example.grades.db.grades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.grades.db.grades.GradeEntity.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class GradeEntity(
	@PrimaryKey
	@ColumnInfo(name = COLUMN_ID) val id: Int,
	@ColumnInfo(name = COLUMN_GRADE) val grade: String
) {
	companion object {
		const val TABLE_NAME = "Grades"
		const val COLUMN_GRADE = "grade"
		const val COLUMN_ID = "id"
	}
}
