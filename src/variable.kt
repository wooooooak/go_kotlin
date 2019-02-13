fun main(args: Array<String>) {
    // 변수를 정의하는 2가지 방법
    varTest()
    valTest()
}

fun varTest() {
    var num : Int
    num = 1

    // var number; -> error
    var number = 2
    // number = 2 -> error 타입이 int로 지정되어 있기 때문
}

fun valTest() {
   // val === const
    val num = 1
    val name : String
    name = ""
    // name="재할당 못함"
}