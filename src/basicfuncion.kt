fun main(args : Array<String>) {
    // fun 함수명(변수명 : 데이터크기, ...) : 리턴값 {return ;}
    funByNoParam()
    funByParameter(3, " 숫자입니다")
    println (funByReturn("3을 넘기니"))
    println(funByInline(3, 10))
    funcVariable ("함수형 변수 1")
    println( funVarByType("함수형 변수 2"))
}

fun funByReturn(s: String): Any? {
    return s + "-를 입력 받았습니다."
}

fun funByParameter(i: Int, s: String) {
    println(i.toString() + s)
}

fun funByInline(i: Int, i1: Int) = i * i1
fun funByNoParam() {
    println("NO PARAM")
}

// 함수를 정의한 변수
val funcVariable = {
    s : String -> println(s)
}
// 위의 코드는 아래와 같다
// val funcVariable : (String) -> Unit = { s : String -> println (s) }

var funVarByType : (String) -> Any? = ::funByReturn
