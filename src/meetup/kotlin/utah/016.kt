package meetup.kotlin.utah

/**
 * @author mberteaux
 */

typealias StrCharFun<T> = (String, Char) -> T

val charCounter: StrCharFun<Int> = { str, toCount ->
    str.filter { it == toCount }.count()
}

val charPrepender: StrCharFun<String> = { str, toPrepend ->
    "$toPrepend$str"
}

fun main(args: Array<String>) {
    println(charPrepender("att", 'M'))
}