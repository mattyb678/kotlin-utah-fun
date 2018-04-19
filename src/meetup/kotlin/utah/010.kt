package meetup.kotlin.utah

/**
 * @author mberteaux
 */

fun fibTailRec(n: Int): Long {
    tailrec fun localFib(n: Int, a: Long, b: Long): Long {
        return when (n) {
            0 -> a
            1 -> b
            else -> localFib(n - 1, b, a + b)
        }
    }
    return localFib(n, 0, 1)
}

fun main(args: Array<String>) {
    println(fibTailRec(10))
}