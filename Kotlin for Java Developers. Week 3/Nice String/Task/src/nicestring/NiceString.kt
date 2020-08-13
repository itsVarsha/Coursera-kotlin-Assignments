package nicestring

fun String.isNice(): Boolean {
    val notContain = setOf("bu","ba","be").all { !this.contains(it) }

    val vowels3 = count { it in "aeiou" } >=3

    val doubleLetters = zipWithNext().any {it.first==it.second}


    return listOf(notContain,vowels3,doubleLetters).count{it}>=2
}
