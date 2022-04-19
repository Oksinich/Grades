package com.example.f_todo.ui

import android.os.Bundle
import android.widget.Button
import com.example.f_todo.R
import com.example.f_todo.ToDoScope
import com.farpost.android.archy.ArchyActivity
import com.farpost.inject.ScopeProvider

open class ToDoActivity : ArchyActivity() {

	private val toDoScope = ScopeProvider(ToDoScope::class.java)

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.to_do_activity)

		val importantButton = findViewById<Button>(R.id.to_do_button)

		importantButton.setOnClickListener {
			toDoScope.get().toDoOutRoute.openBrowser(activityRouter())
		}
	}
}