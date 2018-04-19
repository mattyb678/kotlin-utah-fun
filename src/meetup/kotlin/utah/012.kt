package meetup.kotlin.utah

/**
 * @author mberteaux
 */

fun String.pad(zeroCount: Int): String {
    return (0..zeroCount).map { '0' }
            .joinToString("")
            .plus(this)
}

fun main(args: Array<String>) {
    println("123".pad(5))
}