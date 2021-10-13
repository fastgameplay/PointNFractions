
fun main() {
    println("Hello World!")

    var pointer = Point();
    pointer.SetPoints(0,2);
    var pointer2 = Point();
    pointer2.SetPoints(0.1f,2f);

    println(pointer.EqualTo(pointer2))


}

