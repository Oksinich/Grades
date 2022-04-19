package com.example.grades.db.grades

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.grades.db.GradeAndAllCriteria
import com.example.grades.db.criteria.CriteriaEntity
import com.example.grades.db.grades.GradeEntity.Companion.COLUMN_GRADE
import com.example.grades.db.grades.GradeEntity.Companion.TABLE_NAME

@Dao
interface GradeDao {

	@Query("SELECT * FROM $TABLE_NAME")
	fun getGrades(): List<GradeEntity>?

	@Query("INSERT OR REPLACE INTO $TABLE_NAME ($COLUMN_GRADE) VALUES(:grades)")
	fun upsert(grades: String)

	@Query("SELECT ${GradeEntity.COLUMN_ID} FROM $TABLE_NAME WHERE $COLUMN_GRADE LIKE :gradeName")
	fun getGradesId(gradeName: String): Int

	@Query("DELETE FROM $TABLE_NAME")
	fun deleteAll()

	@Transaction
	@Query("SELECT * FROM $TABLE_NAME")
	fun getGradesAndAllCriteria(): List<GradeAndAllCriteria>
}