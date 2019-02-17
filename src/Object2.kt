// 원래는 이렇게 해야하는데, 너무 거추장스럽다.
//class MyRunnable : Runnable {
//    override fun run() {
//        println("hello kotlin")
//    }
//}

// 객체 표현식은, 이것을 작성하는 순간 어떤 객체가 바로 생성되는 것이다.
//fun main(args: Array<String>) {
//    val t = Thread(object : Runnable {
//        override fun run() {
//            println("hello kotlin")
//        }
//    })
//    t.run()
//}


// 위의 코드를 아래처럼 람다식으로 할 수 있다. 즉, 함수를 넘기는 것처러 할 수 있다.
// 객체 표현식은, 이것을 작성하는 순간 어떤 객체가 바로 생성되는 것이다.
fun main(args: Array<String>) {
    val t = Thread(Runnable { println("hello kotlin") })
    t.run()
}