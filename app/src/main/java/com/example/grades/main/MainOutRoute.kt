package com.example.grades.main

import android.content.Context
import com.farpost.android.archy.router.activity.ActivityRouter

interface MainOutRoute {
	fun openToDo(context: Context, activityRouter: ActivityRouter)
}