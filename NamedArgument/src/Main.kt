fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String, name:String) = println("$greeting, $name")


fun main() {
    //greetPerson("hi", "Nate")
    greetPerson(name =  "Nate", greeting = "hi")
}