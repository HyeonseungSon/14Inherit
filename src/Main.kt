fun main() {
    val s1 = SubClass1()
    println("s1.subMember1 : ${s1.subMember1}")
    s1.subMethod1()
    println("s1.superMember : ${s1.superMember1}")
    s1.superMethod1()
}
// 부모 클래스 1
open class SuperClass1 (var a1:Int) {
    var superMember1 = 100
    fun superMethod1() {
        println("SuperClass1의 메서드 입니다.")
    }
}
// 자식 클래스 1
class SubClass1 : SuperClass1(100) {
    // constructor() : super() //부모 클래스 생성자 호출하지 않은 경우
                              // 클래스 내부에서 constructor() 통해 호출 가능
    val subMember1 = 200
    fun subMethod1 () {
        println("SubClass1의 메서드 입니다.")
    }
}
// 부모 클래스 2
open class SuperClass2 (val a1:Int)
// 자식 클래스 2
class SubClass2 : SuperClass2 {
    constructor() : super(100)
}







