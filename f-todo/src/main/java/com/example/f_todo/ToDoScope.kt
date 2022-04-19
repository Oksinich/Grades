package com.example.f_todo

import com.farpost.inject.Scope

class ToDoScope(
	val toDoOutRoute: ToDoOutRoute
) : Scope {
	val inRoute = ToDoInRoute()
}