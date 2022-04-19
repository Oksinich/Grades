package com.example.grades

import java.util.*
import kotlin.collections.HashMap
import kotlin.random.Random

class MapTest(
	private val n: Int
) {

	private val hashMap: HashMap<Int, Int> = HashMap()
	private val treeMap: TreeMap<Int, Int> = TreeMap<Int, Int>()

	fun populateHashMapTest() {
		val start = System.currentTimeMillis()
		for (i in 0..n) {
			hashMap[i] = Random.nextInt(0, 1000)
		}
		val end = System.currentTimeMillis()
		println(" populate hashMap " + (end - start))
	}

	fun populateTreeMapTest() {
		val start = System.currentTimeMillis()
		for (i in 0..n) {
			treeMap[i] = Random.nextInt(0, 1000)
		}
		val end = System.currentTimeMillis()
		println(" populate treeMap " + (end - start))
	}

	fun putHashMapTest() {
		val start = System.currentTimeMillis()
		hashMap[n + 1] = n + 1

		val end = System.currentTimeMillis()
		println(" put hashMap " + (end - start))
	}

	fun putTreeMapTest() {
		val start = System.currentTimeMillis()
		treeMap[n + 1] = n + 1
		val end = System.currentTimeMillis()
		println(" put treeMap " + (end - start))
	}

	fun findHashMapTest(key: Int) {
		val start = System.currentTimeMillis()
		for (i in 0..15000000) {
			hashMap[key]
		}
		val end = System.currentTimeMillis()
		println(" find hashMap " + (end - start))
	}

	fun findTreeMapTest(key: Int) {
		val start = System.currentTimeMillis()
		for (i in 0..15000000) {
			treeMap[key]
		}
		val end = System.currentTimeMillis()
		println(" find treeMap " + (end - start))
	}

	fun removeHashMap(key: Int) {
		val start = System.currentTimeMillis()
		hashMap.remove(key)
		val end = System.currentTimeMillis()
		println(" remove hashMap " + (end - start))
	}

	fun removeTreeMap(key: Int) {
		val start = System.currentTimeMillis()
		treeMap.remove(key)
		val end = System.currentTimeMillis()
		println(" remove treeMap " + (end - start))
	}

	fun mapClear() {
		hashMap.clear()
		treeMap.clear()
	}
}