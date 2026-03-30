fun conditionalsExercise(weekday: String) {
    // Little lemon cafe conditionals
    var day = weekday.lowercase()

    val time =
        when (day) {
            "monday" -> "Open 8 AM to 12 PM"
            "tuesday", "wednesday", "thursday" -> "Open 8 AM to 6 PM"
            "friday" -> "Open 8 AM to 9 PM"
            "saturday", "sunday" -> "Open 9 AM to 4 PM"
            else -> "Not Applicable"
        }

    println("On $day, the opening hours are: $time")
}