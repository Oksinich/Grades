package com.example.grades

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.grades.main.MainActivity
import com.example.grades.utils.isVisible
import junit.framework.Assert.assertTrue
import org.hamcrest.Matcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

	@get:Rule
	val mainActivityRule = ActivityScenarioRule(MainActivity::class.java)

	private val mainText: Matcher<View> = withId(R.id.text)
	private val mainButton: Matcher<View> = withId(R.id.button)

	@Test
	fun isTextVisible() {
		val visibility: Boolean = mainText.isVisible()
		assertTrue(visibility)
	}

	@Test
	fun isButtonVisible() {
		val visibility: Boolean = mainButton.isVisible()
		assertTrue(visibility)
	}
}