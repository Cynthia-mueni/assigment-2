fun main() {
    printName("Cynthia")
    modulus(7,3)
    sum(4,5,6,7)
    aboutMe("reading,travelling")
}
fun printName(name:String){
    println("Hello $name")
}
fun modulus(a: Int, b:Int):Int{
    var remainder = a % b
    println(remainder)
    return(remainder)
}
fun sum(a:Int, b:Int, c:Int, d:Int){
    var result= a+b+c+d
    println("the result=$result")
}
fun aboutMe(interestingFact:String){
    println(interestingFact)
}