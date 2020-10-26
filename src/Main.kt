fun main()
{
    var zaza = Point(X = 6, Y = 8)


    var  zaza1 = Point(X = 7, Y = 9)

    println(zaza)
    println(zaza == zaza1)
    zaza.walkX(2)
    println(zaza)

}

class Point(X: Int, Y: Int) {
    private var X: Int = X
    private var Y: Int = Y

    fun walkX(n: Int) {
        var d: Int = X + n
        this.X = d
        println("X ის გადაყვანისას მივიღებთ: $d $Y")
    }

    fun moveY(Y: Int) {
        var d: Int = this.Y + Y
        this.Y = d
        println("Y ის გადაყვანისას მივიღებთ: $X $d")
    }

    override fun toString(): String {
        return "$X $Y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (X == other.X && Y == other.Y) {
                return true
            }
        }
        return false
    }
}