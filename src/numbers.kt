fun numbers() {
    var a = 10 // the type of a is Int
    val b = 2147483647L // the type of b is Long
    val c = 10.0 // the type of c is Double
    val d = 10F // the type of d is Float

    val smallDebt = -0.72
    println(smallDebt) // -0.72
    val million = 1_000_000
    println(million) // 1000000

    val i: Int = 10
    val l: Long = i.toLong()
    val d1: Double = i.toDouble()
    val d2: Double = l.toDouble()
    println(d1) // 10.0
    println(d2) // 10.0

    println(2 + 3) // 5
    println(2 - 3) // -1
    println(2 * 3) // 6
    println(8 / 2) // 4

    println(0.5 * 4.5) // 2.25
    println(2.5 / 0.5) // 5.0

    println(10 % 3) // 1
    println(11 % 3) // 2
    println(12 % 3) // 0
    println(13 % 3) // 1

    // The sign of the result is always the same as the sign of the left side
    println(-1 % 3) // -1
    println(1 % -3) // 1
    println(-1 % -3) // -1

    val a2 = 1 + 2L // the type of a is Long
    println("A2: " + a2)
    val b2 = 1 + 2.0 // the type of b is Double
    println("B2: " + b2)
    val c2 = 1.0F + 2 // the type of c is Float
    println("C2: " + c2)
    val d3 = 1.0F + 2.0 // the type of c is Double
    println("D3: " + d3)

    println(a / a) // 2
    println(a.toDouble() / a) // 2.5

    println(a) // 10
    a += 10
    println(a) // 20
    a += 10
    println(a)

    var eq = 6 + ++ a
    println(eq)
    var valnewEq = 6+a
    println(valnewEq)
}