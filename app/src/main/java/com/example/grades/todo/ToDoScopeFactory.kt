package com.example.grades.todo

import com.example.f_todo.ToDoOutRoute
import com.example.f_todo.ToDoScope
import com.farpost.inject.ScopeFactory

class ToDoScopeFactory : ScopeFactory<ToDoScope> {
	override fun create(): ToDoScope = ToDoScope(
		toDoOutRoute = ToDoOutRoute()
	)
}