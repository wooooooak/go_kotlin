object SingleTon {
    // 함수형 변수
    var printMSG = { msg:String -> println(msg) }
}

class NormalClass {
    var msg: String = "일반객체로 생성하면 이 변수를 액세스 가능함"
    companion object {
        var staticVar = "staticVar"
        fun statiFunc() = println("static func")
    }
}

abstract class fakeClickHandler {
    var msg : String = "abstract class"
    abstract fun onClick()
}

// object example
fun main(args: Array<String>) {
    SingleTon.printMSG("this is singleton!")
    val obj = NormalClass()
    println(obj.msg)

    println( NormalClass.staticVar )
    NormalClass.statiFunc()

    // 이름 없는 클래스 객체를 만들고 사용할 때
    // 주로 상속받고 필요한 함수만 override
    var obj2 = object : fakeClickHandler() {
        fun dummyFunc() = "눌렀다"
        override fun onClick() {
            println(dummyFunc())
        }
    }
    obj2.onClick()
}