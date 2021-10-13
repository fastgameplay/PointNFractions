class Fraction() {
    var numerator : Int
        get() { return numerator}
        set(value : Int) { numerator = value}
    var denominator : Int
        get() { return denominator}
        set(value : Int) {if (value != 0) denominator = value}

    fun Usg (_numerator : Int, _denominator: Int) : Int{
        if(_numerator == 0)
            return _numerator
        return Usg(_denominator, _denominator % _numerator)
    }

    fun SimplifyFraction(){
        var i : Int
        i = Usg(numerator,denominator)

        numerator = numerator / i
        denominator = denominator /i
    }


}