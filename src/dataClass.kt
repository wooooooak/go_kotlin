fun main(args: Array<String>) {
    val data1 = BasicInfo("mark", 30)
    val data2 = DetailInfo(name = "siri", dummy = DummyClass().apply {DummyData = "This is dummy data"})
    val (name1, age1) = data1
    println("$name1 : $age1")
    val (name2, age2, dummy) = data2
    println("$name2 : ${dummy?.DummyData}")

    // 이 부분이 제일 유용함
    val data3 = data2.copy(name="회장님")
    println("$data3") // data3.toString() 처럼 해주지 않아도 됨.
}

class DummyClass {
    var DummyData : String? = null
}

data class BasicInfo(var name : String, var age : Int)
data class DetailInfo(var name : String, var age : Int = 30, var dummy :DummyClass? = null)