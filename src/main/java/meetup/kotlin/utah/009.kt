package meetup.kotlin.utah

/**
 * @author mberteaux
 */

fun fib(n: Int): Long {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fib(n - 1) + fib(n - 2)
    }
}

fun main(args: Array<String>) {
    println(fib(10))
}