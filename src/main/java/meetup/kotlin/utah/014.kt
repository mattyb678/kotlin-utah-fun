package meetup.kotlin.utah

/**
 * @author mberteaux
 */

operator fun String.unaryMinus(): String {
    return this.substring(1)
}

fun main(args: Array<String>) {
    println(-"Matt")
    println("Jordan".unaryMinus())
}