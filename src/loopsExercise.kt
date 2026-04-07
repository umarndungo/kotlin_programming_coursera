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
}