class Person (val firstName: String = "Mutwakil", val lastName:String) {

    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickName is $field")
        }
    fun printInfo(){
        //val nickNameToPrint = if (nickName != null) nickName else "no nickname"
        val nickNameToPrint = nickName ?: "no nickname"
        //println("$firstName ($nickName), $lastName")
        println("$firstName ($nickNameToPrint), $lastName")
    }


}
