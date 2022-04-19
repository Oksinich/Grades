package com.example.grades.main

import com.example.f_todo.ToDoScope
import com.farpost.inject.ScopeFactory
import com.farpost.inject.ScopeProvider

class MainScopeFactory : ScopeFactory<MainScope> {

	private val toDoScope = ScopeProvider(ToDoScope::class.java)
	override fun create(): MainScope = MainScope(
		mainOutRoute = AppMainOutRoute(toDoScope.get().inRoute)
	)
}