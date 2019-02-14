fun main(args: Array<String>) {
    // let()
    // 결과를 { -> } 안으로 넘긴다. 그 안에서 이미 선언한 변수처럼 사용한다.
    // -> 를 삭제하면 기본변수인 it로 인식한다.

    letTest().let { value -> println(value) }
    letTest().let { println( it )}
    // aplly()
    var obj = TestClassData().apply {sName = " Kim "; nAge = 35;}
    obj.aboutMe()

    // run()
    obj.run { sName = " Lee "; aging(); sName }.let { println(it) }
    obj.aboutMe()
}

class TestClassData {
    var sName : String = ""
    var nAge : Int = 49
    fun aboutMe() = println("$sName : $nAge")
    fun aging() = nAge++
}
fun letTest() = 10
