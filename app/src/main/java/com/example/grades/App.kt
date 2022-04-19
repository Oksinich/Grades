package com.example.grades

import android.app.Application
import androidx.annotation.UiThread
import com.example.grades.scope.ScopesTree

class App : Application() {
	override fun onCreate() {
		super.onCreate()
		initScopes()
	}

	@UiThread
	fun initScopes() {
		ScopesTree.init()
	}
}