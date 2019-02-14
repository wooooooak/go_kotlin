fun main(args : Array<String>) {
    // 가장 심플한 람다식 표현
    var pfunc = {a: Int, b: Int -> a + b}
    println( pfunc(10, 30) )
    funTest1(pfunc)
    funTest2 {n, n2 -> n + n2}
    funTest3( {n, n2 -> n + n2 }, 100, 10)

    // 함수원형의 포인터를 대입시키는 편법
    var funParameter = {a : Int -> AddFunc(a)}
    funTest4( funParameter )
    // 아래처럼 간결하게도 가능
    funTest4 {a -> AddFunc(a)}
}

fun funTest1(func : (Int, Int) -> Int ) {
    func(10,10).let { result -> println("Result is $result") }
}

fun funTest2(func : (Int, Int) -> Int) {
    println ( func(10, 10) )
}

fun funTest3(func : (Int, Int) -> Int, a : Int, b : Int) {
    println ( func(a,b) )
}

fun funTest4(func : (Int) -> Int) {
    println(func(1))
}

fun AddFunc(i: Int) : Int {return i+100}