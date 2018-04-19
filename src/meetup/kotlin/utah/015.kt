package meetup.kotlin.utah

/**
 * @author mberteaux
 */

val countLetters: (String, Char) -> Int = { str, toCount ->
    str.filter { it == toCount }.count()
}

fun main(args: Array<String>) {
    println(countLetters("Matt", 't'))
}