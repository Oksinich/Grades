package com.example.grades.memory

class Memory {

	fun main() { // в стеке создается место для хранения примитивов и ссылок этого метода
		val i = 1 // в стеке тк примитив
		val cat = Cat(i)// объект создается в хипе, а в стек добавляется ссылка на него
		function(cat)

		val list = mutableListOf<String>() // ссылка в стеке на объект MutableList в хипе
		list.add("One") // в лист добавляется ссылка на пул строк из хипа
	}

	fun function(cat1: Cat) { // в стеке создается блок этого метода
		// объекты и примитивы передаются по значению
		// cat1 - ссылка на cat из хипа, тк в методе main() значение cat это ссылка на объект из хипа
		// изменения с cat1 повлияют на cat из main() пушто ссылка даб даб
		cat1.age = 2
	}
}

class Cat(
	var age: Int
)