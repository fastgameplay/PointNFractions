
fun main() {
    println("Hello World!")
    // In Point() to get axis (GetX(), GetY())
    // Point.Equals( can handle point and float types)
    // Point.WriteLine("Message") Prints point X , Y after message

    var pointer = Point()
    pointer.SetPoints(0,2)
    var pointer2 = Point()
    pointer2.SetPoints(0.1f,2f)

    pointer.WriteLine("First Pointer :" )
    pointer2.WriteLine()
    println( pointer.Equals(pointer2) )


}

