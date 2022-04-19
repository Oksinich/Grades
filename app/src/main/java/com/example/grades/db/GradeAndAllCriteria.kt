package com.example.grades.db

import androidx.room.Embedded
import androidx.room.Relation
import com.example.grades.db.criteria.CriteriaEntity
import com.example.grades.db.grades.GradeEntity

data class GradeAndAllCriteria(
	@Embedded
	val grade: GradeEntity,
	@Relation(
		parentColumn = GradeEntity.COLUMN_ID,
		entityColumn = CriteriaEntity.COLUMN_GRADE_ID_NAME)
	val criteria: List<CriteriaEntity>
	)