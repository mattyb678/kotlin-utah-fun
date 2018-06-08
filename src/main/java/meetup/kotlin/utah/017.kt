package meetup.kotlin.utah

/**
 * @author mberteaux
 */

val names: List<String> = listOf("Matt", "Jordan", "Dave")

fun countMatches(lst: List<String>, f: (String) -> Boolean): Int {
    return lst.filter { f(it) }.count()
}

fun main(args: Array<String>) {
    val count = countMatches(names, { str -> str.length > 4})
    println(count)

    val lessCount = countMatches(names) { it.length <= 4 }
    println(lessCount)
}