package com.example.f_todo

import android.content.Context
import android.content.Intent
import com.example.f_todo.ui.ToDoActivity

class ToDoInRoute {

	fun intent(context: Context): Intent {
		val intent = Intent(context, ToDoActivity::class.java)
		return intent
	}

}