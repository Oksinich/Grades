package com.example.grades.db.criteria

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.grades.db.criteria.CriteriaEntity.Companion.COLUMN_CRITERIA_NAME
import com.example.grades.db.criteria.CriteriaEntity.Companion.COLUMN_GRADE_ID_NAME
import com.example.grades.db.criteria.CriteriaEntity.Companion.TABLE_NAME

@Dao
interface CriteriaDao {

	@Query("SELECT * FROM $TABLE_NAME where $COLUMN_GRADE_ID_NAME is :gradeId")
	fun getGradeCriteria(gradeId: Int): List<CriteriaEntity>?

	@Query("INSERT OR REPLACE INTO $TABLE_NAME (${COLUMN_CRITERIA_NAME}, ${COLUMN_GRADE_ID_NAME}) VALUES(:criteria, :gradeId)")
	fun upsert(criteria: String, gradeId: Int)

	@Query("DELETE FROM $TABLE_NAME")
	fun deleteAll()
}