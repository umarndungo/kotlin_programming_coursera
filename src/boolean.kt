fun Boolean(){

    var cookiePolicyAccepted: Boolean = true

    /*println(cookiePolicyAccepted)
    println("A" == "A") // true
    println("A" == "B") // false
    println(10 == 10) // true
    println(20 == 10) // false

    println("A" == "A") // true
    println("A" == "B") // false
    println(10 == 10) // true
    println(20 == 10) // false

    println("A" != "A") // false
    println("A" != "B") // true
    println(10 != 10) // false
    println(20 != 10) // true

    println(10 > 10) // false
    println(20 > 10) // true
    println(10 > 20) // false

    println(10 < 10) // false
    println(20 < 10) // false
    println(10 < 20) // true

    println(10 >= 10) // true
    println(20 >= 10) // true
    println(10 >= 20) // false

    println(10 <= 10) // true
    println(20 <= 10) // false
    println(10 <= 20) // true*/

    val finishedHomework = false // or true
    val cleanedRoom = true // or false
    val canPlayGames = finishedHomework && cleanedRoom
    if (canPlayGames == false)
        println("No Games till you finish your homework and chores.")
    else
        println("Yes you can son!")


    val percent = 47
    val correct = percent >= 0 && percent <= 100
    println("Your percentage is $correct") // true

    val incorrect = percent < 0 || percent > 100
    println(incorrect) // false



}