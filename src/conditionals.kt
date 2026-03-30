fun conditionals(){
    val finishedHomework = true
    val i = 1 // or 5
    if (finishedHomework) {
        println("Can go to the cinema")
    }else {
        println("Cannot go to the cinema")
    }

    if (i < 3) {
        println("Smaller")
    } else {
        println("Bigger")
    }

    val haveSomeExtraMoney = true
    val tip: Double =
        if (haveSomeExtraMoney) {
            10.0
        } else {
            0.0
        }
    println(tip)




}