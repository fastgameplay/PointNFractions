
fun main() {
    println("Hello World!")
    // In Point() to get axis (GetX(), GetY())
    // Point.Equals( can handle point and float types)
    // Point.WriteLine("Message") Prints point X , Y after message

    var pointer1 = Point()
    pointer1.SetPoints(0,2)
    var pointer2 = Point()
    pointer2.SetPoints(0.0f,2f)

    if(pointer1.Equals(pointer2))
        println(pointer1.ToString() + " = " + pointer2.ToString())
    else println(pointer1.ToString() + " != " + pointer2.ToString())


    var fractions = Fraction()
    fractions.numerator = 1;
    fractions.denominator = 5;



}

