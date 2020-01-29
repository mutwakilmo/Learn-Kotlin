fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    //val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    //  sayHello("Hi" , "Kotlin","Programming","Comic Books")

    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi", *interestingThings)


}