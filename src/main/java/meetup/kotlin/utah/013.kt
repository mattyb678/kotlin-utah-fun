package meetup.kotlin.utah

/**
 * @author mberteaux
 */

infix fun Int.toThe(power: Int): Long {
    return Math.pow(this.toDouble(), power.toDouble()).toLong()
}

fun main(args: Array<String>) {
    println(2 toThe 10)
}