class Person (val firstName: String = "Mutwakil", val lastName:String) {

    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickName is $value")
        }
}