package meetup.kotlin.utah

/**
 * @author mberteaux
 */

fun String.upperEven(): String {
    return this.mapIndexed { i, c -> if (i % 2 == 0) c else c.toUpperCase()}
            .joinToString("")
}

fun main(args: Array<String>) {
    println("hello".upperEven())
}