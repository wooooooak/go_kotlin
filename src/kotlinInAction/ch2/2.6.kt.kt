package kotlinInAction.ch2

class Person_2_6 (
    val name: String, // private field와 public getter가 만들어 진다.
    var isMarried: Boolean // private field와 public getter, setter가 만들어 진다.
)

fun main(args: Array<String>) {
    val person = Person_2_6("bob", true)
    println(person.name)
    println(person.isMarried)

    person.isMarried = false;
    print(person.isMarried)
}