class Point(a : Double, b : Double){
    private var x: Double = a
    private var y: Double = b

    //region Get X/Y()
    var X : Double
        get() { return x}
        set(value) { x = value}

    var Y : Double
        get() { return y}
        set(value) { y = value}
    //endregion



    //region AddPoints()
    fun AddPoints(_x: Int, _y: Int){
        x = _x.toDouble()
        y = _y.toDouble()
    }
    fun AddPoints(_x: Float, _y: Float){
        x = _x.toDouble()
        y = _y.toDouble()
    }
    fun AddPoints(_x: Double, _y: Double){
        x = _x
        y = _y
    }
    //endregion

    //region Equals()
    override fun equals(other : Any? ) : Boolean{
        if(other is Point)
            if(other.X == this.x && other.Y == this.y) return true

        return false
    }
    fun equals(_x : Double , _y: Double) : Boolean{
        if(_x == this.x && _y == this.y) return true

        return false
    }
    //endregion

    //region WriteLine()
    override fun toString() : String{
        return  this.x.toString() + " : " + this.y.toString()
    }

    //endregion
}