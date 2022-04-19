package com.example.grades.main

import android.os.Bundle
import android.widget.Button
import com.example.grades.MapTest
import com.example.grades.R
import com.farpost.android.archy.ArchyActivity

class MainActivity : ArchyActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val hashMap = findViewById<Button>(R.id.hashMap)
		val treeMap = findViewById<Button>(R.id.treeMap)
		val n = 1000000
		val test = MapTest(n)

		hashMap.setOnClickListener {
			test.mapClear()
			test.populateHashMapTest()
			test.putHashMapTest()
			test.findHashMapTest(n+1)
//			test.removeHashMap(n+1)
			println("\n\n")
		}

		treeMap.setOnClickListener {
			test.mapClear()
			test.populateTreeMapTest()
			test.putTreeMapTest()
			test.findTreeMapTest(n+1)
//			test.removeTreeMap(n+1)
			println("\n\n")
		}
	}


}