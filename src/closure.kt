fun main(args: Array<String>) {
    val obj = ani {
        crying()
        eat()
        nCount++
    }
    println("증가된 숫자는 ${obj.nCount}")
    // obj에서 실행하기 때문에 익명함수의 this가 Animal이 된다.
    // 즉 nCount는 obj의 nCount인 것이다.
    obj.setOnEvent(3,"cry", {
        nCount ->
        println ("${nCount} 번 울겠습니다.")
        (1..nCount).map{crying()}
    })
    obj.setOnEvent(2,"eat", {
        nCount ->
        println ("${nCount} 번 먹겠습니다.")
        (1..nCount).map{eat()}
    })

}

// closure 확인
// 넘겨질 객체 Animal.()와 같이 확장함수를 파라미터로 넘긴다
fun ani(extFunc: Animal.() -> Unit) : Animal{
    val ani = Animal()
    // 확장함수가 실행되어야 한다.
    ani.extFunc()
    return ani
}

class Animal {
    open var nCount = 0
    fun crying() = println("$this>> crying!!!")
    fun eat() = println("$this>> eat!!!")
    // java였으면 interface를 사용해서 해야한다.
    // 코틀린에서는 그런 불편함을 없애고 쉽게 이벤트 핸들러를 등록할 수 있다.
    open fun setOnEvent(nCount : Int, message: String, extFunc: Animal.(Int) -> Unit) : Animal{
        // 확장함수가 실행되어야 한다. 숫자를 넘겼다.
        when (message) {
            "cry" -> {extFunc(nCount)}
            "eat" -> {val n = if (nCount < 3) 3 else nCount; extFunc(n)}
            else -> {println("알 수 없는 메시지: $message 입니다.")}
        }
        return this
    }
}