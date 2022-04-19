package com.example.grades.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.grades.db.criteria.CriteriaDao
import com.example.grades.db.criteria.CriteriaEntity
import com.example.grades.db.grades.GradeDao
import com.example.grades.db.grades.GradeEntity

@Database(
	entities = [
		GradeEntity::class,
		CriteriaEntity::class
	],
	version = 2
)
abstract class AppDatabase : RoomDatabase() {

	abstract fun gradesDao(): GradeDao

	abstract fun criteriaDao(): CriteriaDao
}