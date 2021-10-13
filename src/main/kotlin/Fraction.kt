class Fraction(upper : Int, lower : Int) {

    //region Numerator
    private var numerator : Int = upper
    var Numerator : Int
        get() { return numerator}
        set(value : Int) { numerator = value}
    //endregion

    //region Denominator
    private var denominator : Int = lower
    var Denominator : Int
        get() { return denominator}
        set(value : Int) {if (value != 0) denominator = value}
    //endregion

    public fun Simplify() {

        var n = numerator
        val d = denominator
        val largest: Int

        if (numerator < 0) {
            n = -numerator
        }

        if (n > d) {
            largest = n
        }
        else {
            largest = d
        }

        // find the largest number that divide the numerator and
        // denominator evenly
        var gcd = 0
        for (i in largest downTo 2) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i
                break
            }
        }

        // divide the largest common denominator out of numerator, denominator
        if (gcd != 0) {
            numerator /= gcd
            denominator /= gcd
        }
    }

    override fun toString() : String{
        return (numerator.toString() + "/" + denominator.toString())
    }

    //region Operators
    //mushaobs amitom arvkidebt xeluniebs
        operator fun plus (other: Fraction) = Fraction(numerator * other.Denominator + other.Numerator * denominator,denominator * other.Denominator)
        operator fun minus (other: Fraction) = Fraction(numerator * other.Denominator - other.Numerator * denominator,denominator * other.Denominator)
        operator fun times (other: Fraction) = Fraction( numerator * other.Numerator,denominator * other.Denominator)
        operator fun div (other: Fraction) = Fraction( numerator * other.Denominator,denominator * other.Numerator)

    //endregion
}