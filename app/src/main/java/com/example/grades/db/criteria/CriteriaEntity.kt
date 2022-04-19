package com.example.grades.db.criteria

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.grades.db.criteria.CriteriaEntity.Companion.COLUMN_GRADE_ID_NAME
import com.example.grades.db.criteria.CriteriaEntity.Companion.TABLE_NAME
import com.example.grades.db.grades.GradeEntity

@Entity(
	tableName = TABLE_NAME,
	foreignKeys = [
		ForeignKey(
			entity = GradeEntity::class,
			parentColumns = [GradeEntity.COLUMN_ID],
			childColumns = [COLUMN_GRADE_ID_NAME]
		)
	]
)
data class CriteriaEntity(
	@PrimaryKey
	@ColumnInfo(name = COLUMN_ID)
	val id: Int,
	@ColumnInfo(name = COLUMN_CRITERIA_NAME) val criteria: String,
	@ColumnInfo(name = COLUMN_GRADE_ID_NAME) val gradeId: Int
) {
	companion object {
		const val TABLE_NAME = "Criteria"
		const val COLUMN_CRITERIA_NAME = "criteria"
		const val COLUMN_GRADE_ID_NAME = "grade_id"
		const val COLUMN_ID = "id"
	}
}