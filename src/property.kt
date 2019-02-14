var passwd: String = ""
    get() {
        if(field.length > 5) {
            field = "길이를 초과했음"
        }
        return field
    }
    set(s: String) {
        println( "\"$s\"을 저장함")
        field = s
    }

class EmptyClass {
    var message: String = ""
}
var EmptyClass?.newProp: String
    get() {
        return this!!.message
    }
    set(value) {
        this!!.message = value + "-" + this!!.message
    }

var MutableList<String>?.firstHead : String
    get() {
        return this!!.get(0)
    }
    set(value) {
        this!!.add(0, value)
    }

fun main(args: Array<String>) {
    passwd = "123456"
    println(passwd)
    // 내가 만든 클래스에 확장 프로퍼티 추가
    val empty = EmptyClass()
    empty.newProp = "안녕"
    empty.newProp = "반가워요"
    empty.newProp = "새로운 클래스"
    println (empty.newProp)

    val mLog = mutableListOf<String>("success:100", "pass:203", "fail:001")
    println(mLog)
    mLog.firstHead = "success:100"
    mLog.firstHead = "shutdown:-1"
    mLog.forEach {println(">${it}")}
    println(mLog.firstHead)
}