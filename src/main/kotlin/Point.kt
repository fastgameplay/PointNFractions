class Point{
    private var x: Float = 0.0f
    private var y: Float = 0.0f

    //region Get X/Y()
    fun GetX() : Float{
        return x
    }
    fun GetY() : Float{
        return y
    }
    //endregion

    //region SetPoints()
    fun SetPoints(_x: Int, _y: Int){
        x = _x.toFloat()
        y = _y.toFloat()
    }
    fun SetPoints(_x: Float, _y: Float){
        x = _x
        y = _y
    }
    fun SetPoints(_x: Double, _y: Double){
        x = _x.toFloat()
        y = _y.toFloat()
    }
    //endregion

    //region AddPoints()
    fun AddPoints(_x: Int, _y: Int){
        x = _x.toFloat()
        y = _y.toFloat()
    }
    fun AddPoints(_x: Float, _y: Float){
        x = _x
        y = _y
    }
    fun AddPoints(_x: Double, _y: Double){
        x = _x.toFloat()
        y = _y.toFloat()
    }
    //endregion

    //region IsEqual()
    fun EqualTo(other : Point ) : Boolean{
        if(other.GetX() == this.x && other.GetY() == this.y)
            return true
        else
            return false
    }
    fun EqualTo(_x : Float , _y: Float) : Boolean{
        if(_x == this.x && _y == this.y) return true
        else return false
    }
    //endregion
}