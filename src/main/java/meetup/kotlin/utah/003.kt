package meetup.kotlin.utah

/**
 * @author mberteaux
 */

fun sayHelloDefault(name: String = "World") {
    println("Hello $name!")
}

fun main(args: Array<String>) {
    sayHelloDefault("Jordan")
    sayHelloDefault()
}