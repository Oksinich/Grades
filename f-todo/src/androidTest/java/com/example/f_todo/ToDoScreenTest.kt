package com.example.f_todo

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.f_todo.ui.ToDoActivity
import com.example.f_todo.utils.isVisible
import junit.framework.Assert
import junit.framework.Assert.assertTrue
import org.hamcrest.Matcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ToDoScreenTest {

	@get:Rule
	val mainActivityRule = ActivityScenarioRule(ToDoActivity::class.java)

	private val toDoButton: Matcher<View> = withId(R.id.to_do_button)
	private val image: Matcher<View> = withId(R.id.chel)

	@Test
	fun isImageVisible() {
		val visibility: Boolean = image.isVisible()
		assertTrue(visibility)
	}

	@Test
	fun isButtonVisible() {
		val visibility: Boolean = toDoButton.isVisible()
		assertTrue(visibility)
	}
}