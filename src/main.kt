fun main() {
    var names = "codeHive"
    var char1 = names[4]
    var char2 = names[6]
    var char3 = names[7]
    var striings = "$char1, $char2, $char3"
    println(striings)

    var division = givenNumbers(20,3)
    println(division)
    var identity = takesNameAge("Saido", 20)
    println(identity)

    var school = "Akirachix"
    println(school.length)

}

fun givenNumbers(num1:Int,num2:Int): Int {
    var modulus = num1%num2
    return modulus
}

fun takesNameAge(name:String, age:Int){
    println("Hi, my name is $name and I am $age years old")
}
