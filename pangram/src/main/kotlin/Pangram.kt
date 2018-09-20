val re = "[^a-z]".toRegex()

object Pangram {

    fun isPangram(value: String) =
        value
            .toLowerCase()
            .replace(re, "")
            .toList()
            .distinct()
            .size == 26

}
