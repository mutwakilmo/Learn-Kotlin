
fun sayHello(greeting:String, itemsToGreet:List<String>){
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
    interestingThings.add("Dogs")

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value -> println("$key -> $value")  }
    map.put(4,"d")

    /*********************/
    sayHello("Hi", interestingThings)


}