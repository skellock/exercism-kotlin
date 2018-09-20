object Hamming {
    fun compute (from: String, to: String): Int {
        if (from.length != to.length) {
            throw IllegalArgumentException("left and right strands must be of equal length.")
        }

        var distance = 0
        for ((index, value) in from.withIndex()) {
            if (value != to[index]) {
                distance++
            }
        }

        return distance
    }
}
