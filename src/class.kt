fun main(args: Array<String>) {
    val obj1 = TestClass()
    val obj2 = TestClass("Parameter!")
    val obj3 = ParentClass()
    println( obj3.getMyName() )
    val obj4 = ChildClass()
    println(obj4.getMyName())
}

// class name(변수명: 데이터형, ..){} 으로 생성자를 만들어 쓰기도 한다.
class TestClass {
    var name: String = ""
    constructor() {
        println("default constructor")
    }
    // overloaded constructor
    constructor(name: String) {
        this.name = name
        println("$name 을 입력받은 생성자")
    }
}

// 코틀린에서는 기본적으로 상속이 거부되어 있다. 그래서 부모 클래스를 open으로 지정해야 한다.
open class ParentClass {
    var name : String = this.toString()
    fun getMyName() : String = name
}

class ChildClass : ParentClass() {

}