data class Year(val year: Int) {
    val isLeap = year.rem(4) == 0 && year.rem(100) != 0 || year.rem(400) == 0
}
