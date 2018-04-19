package meetup.kotlin.utah

/**
 * @author mberteaux
 */

fun circleAreaNoReturn(radius: Double) = (Math.PI * Math.pow(radius, 2.0))

fun main(args: Array<String>) {
    val area = circleAreaNoReturn(7.5)
    println("%.2f".format(area))
}