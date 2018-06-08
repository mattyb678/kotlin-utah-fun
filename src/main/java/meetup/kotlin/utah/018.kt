package meetup.kotlin.utah

/**
 * @author mberteaux
 */

inline fun functionHandler(num: Int, vararg fs: (Int) -> Int) {
    fs.forEach { println(it(num)) }
}

fun main(args: Array<String>) {
    functionHandler(5, { it -> it * 4})
}