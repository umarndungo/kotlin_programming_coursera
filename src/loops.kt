fun loops() {
    /*var math = 90.90909
    while (math >= 99) {
        println("$math")
        math -= 2
    }
    println("Six - Seven!!")*/

    /*// For loops
    println("All numbers in range inclusive")
    for (i in 0..90 step 30) {
        println(i)
    }

    println("\n\nExcluding largets value.")
    for (i in 0 until 90 step 30) {
        println(i)
    }

    println("\n\nFrom largest to smallest.")
    for (i in 90 downTo 0 step 30) {
        println(i)
    }*/

    println("Nested loops")
    println("To print a square of stars")
    for (i in 1..5) {
        for (j in 1..5) {
            print("*")
        }
        println()
    }

    println("\n\nTo print a triangle of stars")
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println("\n\nTo print an inverted triangle of stars")
    for (i in 1..5) {
        var numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println("\n\nAlternative: To print an inverted triangle of stars")
    for (numberOfStars in 5 downTo 1) {
        for (i in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println("\n\nTo print an inverted triangle of stars using downTo")
    for (numberOfStars in 5 downTo 1) {
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println("\n\nTo print a parameterized triangle of stars")
    val height = 10
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println("\n\nTo print a parameterized inverted triangle of stars using downTo")
    val heighty = 9
    for (numberOfStars in heighty downTo 1) {
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    println("\n\nTo print a unique triangle of stars: Mid is widest")
    val width = 5
    for (i in 1 until width step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println("\n\nTo print a unique triangle of stars: Reflected Triangle")
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}