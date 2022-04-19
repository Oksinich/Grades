package com.example.f_todo

import android.content.Intent
import android.net.Uri
import com.farpost.android.archy.router.activity.ActivityRouter

class ToDoOutRoute {

	fun openBrowser(activityRouter: ActivityRouter) {
		val addressUri: Uri = Uri.parse(BuildConfig.IMPORTANT_URL)
		val openLinkIntent = Intent(Intent.ACTION_VIEW, addressUri)
		activityRouter.startActivity(openLinkIntent)
	}
}