fun main() {
    //n.o2
   var y = integers(45,67,9)
    println(y)

//n.05
    var calculator = Calculator(34,55,67,89)
    calculator.addition(45,67)
    calculator.subtraction(33,22)
    calculator.multiply(3,9)
    calculator.division(0,6)
}
//question 1
fun one(st: String,st1: String): String{
    var st = " I love Kotlin"
    var str = "Mobile applications"
}
//n.o 2
fun integers(m: Int,t: Int,x: Int) : Int {
    var numbers= arrayOf<Int>(m,t,x)
    return numbers.max()
    return numbers.min()


}


//n.o 4



//N.05
class Calculator( var add: Int,var divide: Int, var multiple: Int,var subtract: Int){
    fun addition(num7: Int,num8: Int){
        println(num7 + num8)
    }
    fun subtraction(num9: Int,num4: Int){
        println(num9 - num4)
    }
    fun division(num6: Int, num0: Int){
        println(num6 / num0)
    }
    fun multiply(num: Int,nu: Int){
        println(num * nu)
    }
}