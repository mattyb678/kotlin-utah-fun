package meetup.kotlin.utah

/**
 * @author mberteaux
 */

fun circleArea(radius: Double): Double {
    return (Math.PI * Math.pow(radius, 2.0))
}

fun main(args: Array<String>) {
    val area = circleArea(7.5)
    println("%.2f".format(area))
}

