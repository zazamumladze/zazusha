fun main () {

    val f1 = Fraction(15F, 3F)

    val f2 = Fraction(4F, 16F)

    println(f1.shekreba(f2))
    println(f1.gamravleba(f2))
    f1.shekveca()
}

open class Fraction(z: Float, w:Float) {

    private var numerator: Float = z
    private var denominator: Float = w

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun shekreba(fraction: Fraction): Fraction {
        val mnishvneli = denominator * fraction.denominator
        val mricxveli1 = mnishvneli/denominator * numerator
        val mricxveli2 = mnishvneli/fraction.denominator * fraction.numerator
        return Fraction(mricxveli1+mricxveli2, mnishvneli)

    }

    fun gamravleba(fraction: Fraction): Fraction {
        val muxiani = numerator * fraction.numerator
        val muxiani1 = denominator * fraction.denominator
        return Fraction(muxiani, muxiani1)
    }

    fun shekveca() {
        var f = numerator
        var v = denominator
        while( f != 0F && v != 0F ){
            if(f > v) {
                f = f % v
            }
            else {
                v = v % f
            }

        }
        val mkvecavi = f+v
        val shekveciliN = numerator/mkvecavi
        val shekveciliD = denominator/mkvecavi
        this.denominator = shekveciliD
        this.numerator = shekveciliN
        println("$shekveciliN/$shekveciliD")
    }
}