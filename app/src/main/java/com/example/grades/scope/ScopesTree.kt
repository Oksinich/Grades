package com.example.grades.scope

import com.example.f_todo.ToDoScope
import com.example.grades.main.MainScope
import com.example.grades.main.MainScopeFactory
import com.example.grades.todo.ToDoScopeFactory
import com.farpost.inject.ScopeInjector

object ScopesTree {

	@JvmStatic
	fun init() {
		val scopeInjector = ScopeInjector.getInstance()

		scopeInjector.putScope(MainScope::class.java, MainScopeFactory())
		scopeInjector.putScope(ToDoScope::class.java, ToDoScopeFactory())
	}
}