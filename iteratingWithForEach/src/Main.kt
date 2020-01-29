fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    //for loop
   /* for (interstingThings in interestingThings){
        println(interestingThings)
    }*/

//    interestingThings.forEach {interestingThings ->
//        println(interestingThings)
//    }

    interestingThings.forEachIndexed{index, interestingThings ->
    println("$interestingThings is at index $index")}


}