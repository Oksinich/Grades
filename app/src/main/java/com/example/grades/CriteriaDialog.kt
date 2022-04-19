package com.example.grades

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.grades.db.criteria.CriteriaEntity

class CriteriaDialog(
	private val criteria: List<CriteriaEntity>?
) : DialogFragment() {

	private lateinit var arr: Array<String>

	override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
		return activity?.let {
			toArray()
			val builder = AlertDialog.Builder(it)
			builder.setTitle("Нужные знания")
				.setItems(arr, null)
			builder.create()
		}?: throw IllegalStateException("Activity cannot be null")
	}

	private fun toArray() {
		val kek: MutableList<String> = mutableListOf()
		criteria?.forEach {
			kek.add(it.criteria)
		}
		arr = kek.toTypedArray()
	}
}