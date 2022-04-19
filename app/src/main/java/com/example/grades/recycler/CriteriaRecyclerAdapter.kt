package com.example.grades.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grades.R
import com.example.grades.db.criteria.CriteriaEntity
import com.example.grades.db.grades.GradeEntity

class CriteriaRecyclerAdapter(
	private val criteria: List<CriteriaEntity>?
) : RecyclerView.Adapter<CriteriaRecyclerAdapter.ViewHolder>() {
	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		var text: TextView? = null

		init {
			text = itemView.findViewById(R.id.text)
		}
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val itemView =
			LayoutInflater.from(parent.context)
				.inflate(R.layout.list_data, parent, false)
		return ViewHolder(itemView)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.text?.text = criteria?.get(position)?.criteria
	}

	override fun getItemCount(): Int = criteria?.size!!
}