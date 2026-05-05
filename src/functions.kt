fun printing(){
    // empty
}

// print starts
//
fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

// extract a function to draw the whole ascending triangle.
fun ascendingTriangle(height: Int) {
    for (i in 1..height) {
        printStars(i)
    }
}

// descending triangle
fun descendingTriangle(height: Int) {
    for (stars in height downTo 1) {
        printStars(stars)
    }
}

// isosceles triangle
fun isoscelesTriangle(width: Int) {
    ascendingTriangle(width - 1)
    descendingTriangle(width)
}

// functions with a return
fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

fun biggerOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b

}

// Single-expression functions
// Often, developers define functions just to return a processed value.
// Both triangleArea and biggerOf are great examples.
// Such functions can be recognized by the return keyword used in the first line.
// That means the whole body is just a single expression.
fun triangleArea1(width: Double, height: Double): Double {
    return width * height / 2
}

fun biggerOf1(a: Int, b: Int): Int {
    return if (a > b) a else b
}
/*
  In Kotlin, there is a special syntax for single expression functions.
  Instead of braces with the body, you use the equality sign,
  which specifies what should be returned.
 */
fun triangleArea2(width: Double, height: Double): Double = width * height / 2

fun biggerOf2(a: Int, b: Int): Int = if (a > b) a else b

// Such notation is shorter, but you won't really encounter it in the course because it can be overly complicated.
// But you need to be aware that single-expression functions exist because they are popular in professional projects.
//
//Single-expression functions are nothing new,
// they are just a simpler notation for functions.
// Here is how you can understand them:
/*
    fun {function name}({parameters}): {result type} = {expression body}

    is equivalent to

    fun {function name}({parameters}): {result type} {
        return {expression body}
    }

    For instance:
 */
fun triangleArea3(width: Double, height: Double): Double = width * height / 2

// is equivalent to

fun triangleArea4(width: Double, height: Double): Double {
    return width * height / 2
}


fun main() {
    println("Ascending triangle:")
    ascendingTriangle(5)
    println("\nDescending triangle:")
    descendingTriangle(5)
    println("\nIsosceles triangle:")
    isoscelesTriangle(5)

    println("\nPart Two => Functions with a return:")
    println("\nTriangle Area Function: triangleArea(width, height);")
    val area: Double = triangleArea(1.0, 2.0)
    println(area) // 1.0
    println(triangleArea(2.0, 2.0)) // 2.0
    println(triangleArea(5.0, 5.0)) // 12.5
    println(triangleArea(10.0, 20.0)) // 100.0
    println("\nBiggerOf function: biggerOf(value a, value b);")
    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20))

}