fun numbers_exercise() {
    /*println(123 + 456 * 789) //359907
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9) //141
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9) //839
    println(13530.0 / 1.23) //11000.0*/

    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3
    println(totalScore) //257
    println(averageScore) //85

    val boostMultiplier = 4
    val scoreBoost = totalScore * boostMultiplier
    val finalBoostedScore = totalScore+scoreBoost

    println(scoreBoost) // 1028
    println(finalBoostedScore) // 1285


}