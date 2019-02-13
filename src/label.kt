fun main(args: Array<String>) {
    doubleLoop()
    println("==================")
    ExitDoubleLoop()
    println( lambdaReturn() )
}

// @레이블 지정 후, breack@레이ㅂㄹ로 나감
// goto문과 유사함
// 거의 사용되지 않는 문법이지만, 함수형 프로그래밍 지원 때문에 더 강조된듯 핫
fun ExitDoubleLoop() {
    HereToExit@ for (i in 0..2) {
        for (j in 0..10) {
            if (j==5) break@HereToExit
            println("i->$i, j->$j")
        }
        println("j loop end")
    }
    println("i loop end")
}

fun doubleLoop() {
    for (i in 0..2) {
        for (j in 0..10) {
            if (j==2) break
            println("i->$i, j->$j")
        }
        println("j loop end")
    }
    println("j loop end")
}

// 이름 없는 함수(람다식)의 리턴
var lambdaReturn = Exit@{
    if(true) {
        return@Exit 3
    }
    1000
}

var pf = {a:Int, b: Int -> a+b}