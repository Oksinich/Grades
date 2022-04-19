package com.example.grades.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grades.R
import com.example.grades.db.grades.GradeEntity

class GradesRecyclerAdapter(
	private val grades: List<GradeEntity>?
) : RecyclerView.Adapter<GradesRecyclerAdapter.ViewHolder>() {

	var click: ((Int) -> Unit)? = null

	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		val text: TextView = itemView.findViewById(R.id.text)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val itemView =
			LayoutInflater.from(parent.context)
				.inflate(R.layout.list_data, parent, false)
		return ViewHolder(itemView)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		val grade = grades?.get(position)
		holder.text.text = grade?.grade

		holder.text.setOnClickListener {
			click?.invoke(position)
		}
	}

	override fun getItemCount(): Int = grades?.size!!
}