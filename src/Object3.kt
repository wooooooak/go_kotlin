object MyClass_1 {
    init {
        println ("create MyClass_1")
    }
}
object MyClass_2 {

}
object MyClass_3 {

}

fun main(args: Array<String>) {
    println(1) // 이 순간은 MyClass 객체들은 없다.
    println(MyClass_1)  // 사용하는 순간에 MyClass_1이 생성된다.
    println(MyClass_1)  // 객체가 더 생성 되는 것이 아니다. 완벽히 싱글톤으로 작동한다.
    println(2)
    println(MyClass_2)
    println(3)
    println(MyClass_3)
}