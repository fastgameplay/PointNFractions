class Point(){
    private var x: Float = 0.0f
    private var y: Float = 0.0f

    //region Get X/Y()
    public fun GetX() : Float{
        return x
    }
    public fun GetY() : Float{
        return y
    }
    //endregion

    //region SetPoints()
    public fun SetPoints(_x: Int, _y: Int){
        x = _x.toFloat()
        y = _y.toFloat()
    }
    public fun SetPoints(_x: Float, _y: Float){
        x = _x
        y = _y
    }
    public fun SetPoints(_x: Double, _y: Double){
        x = _x.toFloat()
        y = _y.toFloat()
    }
    //endregion

    //region AddPoints()
    public fun AddPoints(_x: Int, _y: Int){
        x = _x.toFloat()
        y = _y.toFloat()
    }
    public fun AddPoints(_x: Float, _y: Float){
        x = _x
        y = _y
    }
    public fun AddPoints(_x: Double, _y: Double){
        x = _x.toFloat()
        y = _y.toFloat()
    }
    //endregion

    //region IsEqual()
    public fun EqualTo(other : Point ) : Boolean{
        if(other.GetX() == this.x && other.GetY() == this.y)
            return true
        else
            return false
    }
    public fun EqualTo(_x : Float , _y: Float) : Boolean{
        if(_x == this.x && _y == this.y) return true
        else return false
    }
    //endregion
}