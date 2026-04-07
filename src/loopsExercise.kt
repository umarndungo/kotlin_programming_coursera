fun loopsExercise(){
    println("\nA reflected inverted Triangle")
    for (i in 1..5){
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces){
            print(" ")
        }
        val numberOfStars = 6 - i
        for (j in numberOfStars downTo 1){
            print("*")
        }
        println()
    }

    println("\nAn inverted Isosceles Triangle")
    for (i in 1..5){
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces){
            print(" ")
        }
        val numberOfStars = 11 - i * 2
        for (j in 1 ..numberOfStars){
            print("*")
        }
        println()
    }
    println("\nA Triangle ending an one beginning below it")
    for (i in 1 until 5) {
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
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}