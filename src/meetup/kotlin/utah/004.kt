package meetup.kotlin.utah

/**
 * @author mberteaux
 */

fun sayHelloNamed(greeting: String = "Hello", name: String = "World", exclamation: String = "!") {
    println("$greeting $name$exclamation")
}

fun main(args: Array<String>) {
    sayHelloNamed()
    sayHelloNamed(name = "Matty B")
    sayHelloNamed(exclamation = ".")
}