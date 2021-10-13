
fun main() {
    println("Hello World!")
    // In Point() to get axis (GetX(), GetY())
    // Point.Equals( can handle point and float types)
    // Point.WriteLine("Message") Prints point X , Y after message

    var pointer1 = Point(0.2,5.1)
    var pointer2 = Point(0.1,5.2)


    if(pointer1 == pointer2)
        println(pointer1.toString() + " = " + pointer2.toString())
    else println(pointer1.toString() + " != " + pointer2.toString())


    var fractions1 = Fraction(9,11)

    var fractions2 = Fraction(21,4)
    


    println((fractions1.toString()))
    println((fractions2.toString()))


    //2 saati amragacasis kotlin-ze amushavebas vcdilobdi 5 damiwere ra :DD
    var pluseF = fractions1 + fractions2
    pluseF.Simplify()
    println(fractions1.toString() + " + " + fractions2.toString() + " = " + pluseF.toString())

    var minusF = fractions1 - fractions2
    minusF.Simplify()
    println(fractions1.toString() + " - " + fractions2.toString() + " = " + minusF.toString())

    var timesF = fractions1 * fractions2
    timesF.Simplify()
    println(fractions1.toString() + " * " + fractions2.toString() + " = " + timesF.toString())

    var divF = fractions1 / fractions2
    divF.Simplify()
    println(fractions1.toString() + " / " + fractions2.toString() + " = " + divF.toString())

}

