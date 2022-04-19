package com.example.grades.db

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.grades.db.criteria.CriteriaEntity
import com.example.grades.db.grades.GradeEntity

class Migration2 : Migration(1, 2) {
	override fun migrate(database: SupportSQLiteDatabase) {
		database.execSQL(
			"CREATE TABLE "
				+ "`${CriteriaEntity.TABLE_NAME}` ("
				+ "${CriteriaEntity.COLUMN_ID} INTEGER NOT NULL, "
				+ "${CriteriaEntity.COLUMN_CRITERIA_NAME} TEXT NOT NULL, "
				+ "${CriteriaEntity.COLUMN_GRADE_ID_NAME} INTEGER NOT NULL, "
				+ "PRIMARY KEY(${CriteriaEntity.COLUMN_ID}),"
				+ "FOREIGN KEY (${CriteriaEntity.COLUMN_GRADE_ID_NAME}) REFERENCES ${GradeEntity.TABLE_NAME} (${GradeEntity.COLUMN_ID})"
				+ ")"
		)
	}
}