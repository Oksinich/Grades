package com.example.f_todo.utils

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

/** Проверка, отображается ли элемент на экране */
fun Matcher<View>.isVisible(): Boolean {
	return try {
		onView(this)
			.check(
				ViewAssertions.matches(
					allOf(
						isDisplayed(),
						withEffectiveVisibility(Visibility.VISIBLE)
					)
				)
			)
		true
	} catch (e: NoMatchingViewException) {
		false
	} catch (e: AssertionError) {
		false
	}
}
