class Person(val firstName: String = "Mutwakil", val lastName:String = "MO") {

    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickName is $value")
        }
    get() {
        println("the returned value is $field")
        return field
    }

    fun printInfo(){
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }


}
