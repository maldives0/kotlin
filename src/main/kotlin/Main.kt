import how.pkg.Function
import how.pkg.Test
import how.pkg.Test2

fun main(args: Array<String>) {


    val test1: Test = Test()
    test1.method()

    val test2 = Test2()
    test2.method2()

    Function()
}








//    println("Hello World!")
//    val a1:Int = 100
//    println("al: $a1")
//
//    var a3:Int = 1000
//    val a4:Int = 2000
//    a3 = 4000
//    println("==========================================")
//   var a5:Int? = null
//    var a6:Int = a4!!
//
//    println("a6: $a6")
//    println("==========================================")
//
//    val result:Int = test(11)
//    println("function : $result")
//
//    println("==========================================")
//    val class1 = Obj();
//println("$class1")
//    val class2 = Obj2()
//    println("$class2")
//    println("==========================================")
//    val class3 = Obj3(7)
//    println("$class3")
//    println("==========================================")
//var s1 = SubClass()
//    println("${s1.subMember}")
//    s1.superMethod()
//    println("==========================================")
//



open class SuperClass2(val a:Int)
class SubClass2: SuperClass2{
    constructor(): super(3)
}

open class SuperClass{
    var member = "front"
    fun superMethod(){
        println("method")
    }
}
class SubClass: SuperClass(){
    var subMember = "back"
    fun superMethod2(){
        println("method2")
    }
}


fun test(a:Int=0, b:Int=0): Int{

    return a+b
}
class Obj{
    init{
        println("init")
    }
}
class Obj2{
    var a = 0
    var b = 0
    constructor(){
        println("constructor: $a, $b")
    }
}

class Obj3 constructor(var a:Int, var b:Int){
    init{
        println("$a")
        println("$b")
    }
    constructor(a:Int): this(a,50){
        println("second")
    }
}