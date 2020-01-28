
val name = "Mutwakil"
var greeting: String? = null

fun main() {
    //if statement

   /* if (greeting != null){
        println(greeting)
    } else{
        println("Hi")
    }
    println(name)*/

    /*******************************************/
    //When

   /* when (greeting){
        null -> println("Bonjour")
        else -> println(greeting)
    }
    println(name)*/

    /****************************************************************/

    /*val greetingToPrint = if (greeting != null) greeting else "Hoi"
    println(greetingToPrint)
    println(name)*/

    greeting = "Guten tag"
    val greetingToPrint = when (greeting){
        null ->"Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}
