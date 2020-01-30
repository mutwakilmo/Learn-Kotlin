class Person (val firstName:String, val lastName:String) {

    init {
        println("init1")
    }
    constructor(): this("peter", "parker"){
        println("secondary constructor")
    }
}