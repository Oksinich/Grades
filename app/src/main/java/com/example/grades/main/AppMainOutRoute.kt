package com.example.grades.main

import android.content.Context
import com.example.f_todo.ToDoInRoute
import com.example.grades.main.MainOutRoute
import com.farpost.android.archy.router.activity.ActivityRouter

class AppMainOutRoute(
	private val toDoInRoute: ToDoInRoute
): MainOutRoute {
	override fun openToDo(context: Context, activityRouter: ActivityRouter) {
		activityRouter.startActivity(toDoInRoute.intent(context))
	}
}