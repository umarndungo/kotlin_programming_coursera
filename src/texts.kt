fun texts() {
    val myChar: Char = 'A'
    val myString: String = "Omar"
    var age = 28

    println(myString + " is " + age + " years old.")

    val stuff = """
        Don't ever be a sicko
        Because sickos are not good-o
        And the love to do bad-o
    """.trimIndent()
    println(stuff)
    val letter = myChar.toString()
    println(letter)

    val startsWithLo = myString.startsWith("Hel")
    val endsWithLo = myString.endsWith("lo")
    val firstChar = myString.first()
    val lastChar = myString.last()
    val equalsHello = myString.equals("Hello") //True if the String is equal to Hello, otherwise false
    val myLowerString = myString.lowercase()
    val myString2 = myString.substring(1)


    println(startsWithLo)
    println(endsWithLo)
    println(firstChar)
    println(lastChar)
    println(equalsHello)
    println(myLowerString)
    println(myString2)
    println("$age + 20")
    println("${age+20}")
}