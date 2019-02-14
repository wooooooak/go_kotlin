fun main(args: Array<String>) {
    val l : LateInitTest = LateInitTest()
    l.Test()
    val l2 : LazyInitTest = LazyInitTest()
    l2.Test()
}

class LateInitTest{
    var normalValue : Int = 3
    var initTest : Int
    lateinit var late : String
    init {
        initTest = 0
    }
    fun Test() {
        this.late = "lateinit 초기화"
        println(this.late)
    }
}

class LazyInitTest {
    val lazy1 : String by lazy {
        "lazyinit 초기화"
    }
    val lazy2 : Int by lazy {
        println("1회 초기화 시 몇 줄 코딩도 가능")
        for (i in (0..5)) {
            println(i)
        }
        333
    }
    fun Test() {
        println(lazy1)
        println(lazy2)
        println(lazy2)
    }
}